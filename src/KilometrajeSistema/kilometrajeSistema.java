/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KilometrajeSistema;

/**
 *
 * @author wesrm
 */
public class kilometrajeSistema {
    private double kilometros;
    private int rpm;
    private int velocidad;

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getKilometros() {
        return kilometros;
    }

    public int getRpm() {
        return rpm;
    }
    
    public void aumentarKilometros(double tiempoHoras){
        this.kilometros += velocidad * tiempoHoras;
    }
  
    
    public kilometrajeSistema(int rpm, int velocidad) {
        this.kilometros = 0;
        this.rpm = rpm;
        this.velocidad = velocidad;
    }
    
    
}