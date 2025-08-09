package entornos;

public class EntornoArboles implements GenericsMotion, Runnable {

    private boolean existe;
    private Thread hilo;
    private boolean activo = false; 

    public boolean isExiste() {
        return existe;
    }

    @Override
    public void aparecer() {
        this.existe = true;
    }

    @Override
    public void desaparecer() {
        this.existe = false;
    }

    public void iniciarAnimacion() {
        if (hilo == null || !hilo.isAlive()) {
            activo = true;
            hilo = new Thread(this);
            hilo.start();
        }
    }

    public void detenerAnimacion() {
        activo = false;
    }

    @Override
    public void run() {
        while (activo) {
            aparecer();
            dormir(500);
            desaparecer();
            dormir(500);
        }
    }

    private void dormir(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();         }
    }
}
