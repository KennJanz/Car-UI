/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinturones;

/**
 *
 * @author UTN
 */
public class SistemaCinturones {
     private Cinturon[] cinturones;

    public boolean estaColocado(int asiento) {
        if (asiento >= 0 && asiento < cinturones.length) {
            return cinturones[asiento].isColocado();
        }
        return false;
    }

    public String getOcupante(int asiento) {
        if (asiento >= 0 && asiento < cinturones.length) {
            return cinturones[asiento].getOcupante();
        }
        return null;
    }

    public int totalColocados() {
        int total = 0;
        for (Cinturon c : cinturones) {
            if (c.isColocado()) total++;
        }
        return total;
    }

    public int cantidadCinturones() {
        return cinturones.length;
    }

    public void colocarCinturon(int asiento) {
        if (asiento >= 0 && asiento < cinturones.length) {
            cinturones[asiento].colocar();
        }
    }

    public void quitarCinturon(int asiento) {
        if (asiento >= 0 && asiento < cinturones.length) {
            cinturones[asiento].quitar();
        }
    }

    public SistemaCinturones(String[] ocupantes) {
        cinturones = new Cinturon[ocupantes.length];
        for (int i = 0; i < ocupantes.length; i++) {
            cinturones[i] = new Cinturon(ocupantes[i]);
        }
    }
} 

