/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemailuminacion;

/**
 *
 * @author unknown
 */
public class LucesDelanteras extends Luces implements GenericsLights {
    
    private Luces lucesDelanteras;

    public Luces getLucesDelanteras() {
        return lucesDelanteras;
    }
    
    public void apagarLucesAltas(){
        lucesDelanteras.apagar();
    }
    
    public void encenderLucesAltas(){
        lucesDelanteras.encender();
    }
    
    @Override
    public void encenderLuces(){
        lucesDelanteras.cambiarColor(Colores.YELLOW);
      }
    
    @Override
    public void apagarLuces(){
        lucesDelanteras.cambiarColor(Colores.BLACK);
    }

    public LucesDelanteras() {
        super(Colores.BLACK);
        this.lucesDelanteras.apagar();
    }
  
}
