/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CombustibleSistema;

/**
 *
 * @author Yumor
 */
public class ComsumoSistem {
    private double nivel;
    private double consumo; 
    

    public double getNivel() {
        return nivel;
    }

    public double getConsumo() {
        return consumo;
    }
    
    public boolean consumir() {
    int cantidad = 50;
    if (cantidad > 0 && cantidad <= nivel) {
        nivel -= cantidad;
        return true;
    }
    return false;
}

public boolean repostar(double cantidad) {
    if (cantidad > 0) {
        nivel += cantidad;
        return true;
    }
    return false;
}

public double obtenerNivel() {
    return nivel;
}

   
     public ComsumoSistem() {
        this.nivel = 100.0;
        this.consumo = 0;
    }
}
