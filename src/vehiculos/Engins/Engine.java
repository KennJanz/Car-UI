/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Engins;

/**
 *
 * @author unknown
 */
public class Engine {
    private boolean startEngine;

    public boolean isStartEngine() {
        return startEngine;
    }

    public void setStartEngine(boolean startEngine) {
        this.startEngine = startEngine;
    }
    
    public void encender(){
        this.startEngine = true;
    }
    
    public void apagar(){
        this.startEngine = false;
    }
    
    public boolean isStarEngine(){
        return startEngine;
    }

    public Engine() {
        this.startEngine = false;
    }
   
}
