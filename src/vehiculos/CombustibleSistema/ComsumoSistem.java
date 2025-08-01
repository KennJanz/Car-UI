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

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public ComsumoSistem(double nivel, double consumo) {
        this.nivel = nivel;
        this.consumo = consumo;
    }
    
      public void consumir(double cantidad) {
        if (cantidad > 0 && cantidad <= nivel) {
            nivel -= cantidad;
        } else {
            System.out.println("No hay suficiente combustible para consumir esa cantidad.");
        }
    }

    public void repostar(double cantidad) {
        if (cantidad > 0) {
            nivel += cantidad;
        } else {
            System.out.println("La cantidad a repostar debe ser positiva.");
        }
    }

    public double obtenerNivel() {
        return nivel;
    }
   
    
}
