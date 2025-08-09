/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinturones;

/**
 *
 * @author UTN
 */
public class Cinturon {
    private boolean colocado;
    private String ocupante;

    public boolean isColocado() {
        return colocado;
    }

    public String getOcupante() {
        return ocupante;
    }
    
    public void setColocado(boolean colocado) {
        this.colocado = colocado;
    }

    public void setOcupante(String ocupante) {
        this.ocupante = ocupante;
    }

    public Cinturon(String ocupante) {
        this.ocupante = ocupante;
        this.colocado = false;//Por defecto esta sin colocar el cinturon, por eso no esta en los parametros
    }
    
    public void colocar() {
        colocado = true; //Es un método que cambia el estado del cinturón a Colocado
    }

    public void quitar() { //Es un método que cambia el estado del cinturón a Descolocado
        colocado = false;
    }
} 
 
