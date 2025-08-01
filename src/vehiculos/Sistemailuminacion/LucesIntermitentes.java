package Sistemailuminacion;

public class LucesIntermitentes extends Luces implements GenericsLights, Runnable {

    private boolean luzIntermitenteEncendida;
    private Thread hilo;

    public boolean isLuzIntermitenteEncendida() {
        return luzIntermitenteEncendida;
    }

    @Override
    public void encenderLuces() {
        if (!luzIntermitenteEncendida) {
            luzIntermitenteEncendida = true;
            hilo = new Thread(this);
            hilo.start();
        }
    }

    @Override
    public void apagarLuces() {
        luzIntermitenteEncendida = false;
        this.cambiarColor(Colores.BLACK);
        if (hilo != null && hilo.isAlive()) {
            hilo.interrupt();
            try {
                hilo.join(); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        }
    }

    @Override
    public void run() {
        while (luzIntermitenteEncendida) {
            this.cambiarColor(Colores.YELLOW);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }

            this.cambiarColor(Colores.BLACK);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public LucesIntermitentes() {
        super(Colores.BLACK);
        this.luzIntermitenteEncendida = false;
    }
}
