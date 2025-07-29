/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPuertas;

/**
 *
 * @author Yumor
 */
public class Puerta {
    private int Idpuerta; 
    private boolean estado; 

    public int getIdpuerta() {
        return Idpuerta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Puerta(int Idpuerta, boolean estado) {
        this.Idpuerta = Idpuerta;
        this.estado = false;
    }
    
    
}
