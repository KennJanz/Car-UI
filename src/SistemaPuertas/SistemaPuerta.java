
package SistemaPuertas;

public class SistemaPuerta {
private Puerta[] puertas = new Puerta[4];

    public SistemaPuerta() {
        for (int i = 0; i < puertas.length; i++) {
            puertas[i] = new Puerta(i, false);
        }
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void abrirPuerta(int i) {
        if (esIndiceValido(i)) {
            puertas[i].setEstado(true);
        }
    }

    public void cerrarPuerta(int i) {
        if (esIndiceValido(i)) {
            puertas[i].setEstado(false);
        }
    }

    public boolean estaAbierta(int i) {
        return esIndiceValido(i) && puertas[i].isEstado();
    }

    private boolean esIndiceValido(int i) {
        return i >= 0 && i < puertas.length;
    }
    public boolean hayPuertaAbierta() {
    for (Puerta puerta : puertas) {
        if (puerta != null && puerta.isEstado()) {
            return true;
        }
    }
    return false;
}

} 
