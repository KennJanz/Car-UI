/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensor;
import SistemaPuertas.Puerta;
import SistemaPuertas.SistemaPuerta;

public class SistemaSensores {
    private Sensor sensorFrenoMano;
    private Sensor sensorReversa;
    private SistemaPuerta sistemaPuerta;

    public Sensor getSensorFrenoMano() {
        return sensorFrenoMano;
    }

    public Sensor getSensorReversa() {
        return sensorReversa;
    }

    public void setSensorFrenoMano(Sensor sensorFrenoMano) {
        this.sensorFrenoMano = sensorFrenoMano;
    }

    public void setSensorReversa(Sensor sensorReversa) {
        this.sensorReversa = sensorReversa;
    }

    public SistemaSensores(SistemaPuerta sistemaPuerta) {
        this.sistemaPuerta = sistemaPuerta;
        this.sensorFrenoMano = new Sensor("FrenoMano");
        this.sensorReversa = new Sensor("Reversa");
    }

    // Otros métodos
    public boolean hayAlertaMovimiento(boolean vehiculoEnMovimiento) {
        if (!vehiculoEnMovimiento) return false;

        if (sensorFrenoMano.isActivado()) return true;

        if (sensorReversa.isActivado()) return true;

        for (Puerta puerta : sistemaPuerta.getPuertas()) {
            if (puerta != null && puerta.isEstado()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "SistemaSensores{" + sensorFrenoMano + ", " + sensorReversa + "}";
    }
} 