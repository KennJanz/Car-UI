/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAC;

/**
 *
 * @author Yumor
 */
public class SistemaCondicionado {
    private int temperatura;
    private int velocidadVentilador;
    private boolean aireAcondicionado;
    private boolean calefaccion;

    public int getTemperatura() {
        return temperatura;
    }

    public int getVelocidadVentilador() {
        return velocidadVentilador;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setVelocidadVentilador(int velocidadVentilador) {
        this.velocidadVentilador = velocidadVentilador;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public void ajustarTemperatura(int nueva) {
        temperatura = nueva;
    }

    public void encenderAC() {
        aireAcondicionado = true;
        calefaccion = false; 
    }

    public void apagarAC() {
        aireAcondicionado = false;
    }
    
    public void encenderCalefaccion() {
        calefaccion = true;
        aireAcondicionado = false; 
    }

    public void apagarCalefaccion() {
        calefaccion = false;
    }

    public void VelocidadVentilador(int nivel) {
        if (nivel >= 0 && nivel <= 5) { 
            velocidadVentilador = nivel;
        }
    }

    

}
