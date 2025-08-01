/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemailuminacion;

/**
 *
 * @author unknown
 */
public class LucesPuertas {
    private Colores lucesPuertas;
    private boolean LuzPuertaEncendida;

    public Colores getLucesPuertas() {
        return lucesPuertas;
    }

    public boolean isLuzPuertaEncendida() {
        return LuzPuertaEncendida;
    }
    
    public void apagarLuzPuerta(){
        this.LuzPuertaEncendida = false;
    }
    
    public void encenderLuzPuerta(){
        this.LuzPuertaEncendida = true;
    }
    
    public void cambiarLuzPuertaOff(){
        this.lucesPuertas = Colores.BLACK;
    }
    
    public void cambiarLuzPuertaOn(){
        this.lucesPuertas = Colores.RED;
    }

    public LucesPuertas(Colores lucesPuertas, boolean LuzPuertaEncendida) {
        this.lucesPuertas = Colores.BLACK;
        this.LuzPuertaEncendida = false;
    }
    
    
}
