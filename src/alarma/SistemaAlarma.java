/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alarma;

import SistemaPuertas.Puerta;
import SistemaPuertas.SistemaPuerta;

/**
 *
 * @author UTN
 */
public class SistemaAlarma {
 private boolean activada;
   private SistemaPuerta sistemaPuerta;

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public SistemaAlarma(SistemaPuerta sistemaPuerta) {
        this.sistemaPuerta = sistemaPuerta;
        this.activada = false;
    }

    public void activarAlarma() {
        activada = true;
        for (Puerta puerta : sistemaPuerta.getPuertas()) {
            if (puerta != null) puerta.setEstado(false);
        }
    }

    public void desactivarAlarma() {
        activada = false;
        for (Puerta puerta : sistemaPuerta.getPuertas()) {
            if (puerta != null) puerta.setEstado(true);
        }
    }

    @Override
    public String toString() {
        return "SistemaAlarma{activada=" + activada + ", puertasBloqueadas=" + !sistemaPuerta.hayPuertaAbierta() + '}';
    }
} 