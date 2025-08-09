/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensor;

/**
 *
 * @author UTN
 */
public class Sensor {
      private String tipo;
    private boolean activado;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public Sensor(String tipo) {
        this.tipo = tipo;
        this.activado = false;
    }

    @Override
    public String toString() {
        return "Sensor{" + "tipo='" + tipo + '\'' + ", activado=" + activado + '}';
    }
} 