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
    private int idPuerta; 
    private boolean estado; 

    public Puerta(int idPuerta, boolean estado) {
        this.idPuerta = idPuerta;
        this.estado = estado;
    }

    public int getIdPuerta() {
        return idPuerta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Puerta{idPuerta=" + idPuerta + ", estado=" + estado + "}";
    }
} 