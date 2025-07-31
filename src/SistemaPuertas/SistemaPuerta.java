
package SistemaPuertas;
import SistemaPuertas.Puerta;
/**
 *
 * @author Yumor
 */
public class SistemaPuerta {
    private Puerta[] puertas = new Puerta[4];

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

    public boolean[] mostrarEstados() {
    boolean[] estados = new boolean[puertas.length];
    for (int i = 0; i < puertas.length; i++) {
        if (puertas[i] != null) {
            estados[i] = puertas[i].isEstado();
        }
    }
    return estados;
}
    private boolean esIndiceValido(int i) {
        return i >= 0 && i < puertas.length;
    }
    
}

