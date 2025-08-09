/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemailuminacion;

/**
 *
 * @author unknown
 */
public class LucesTraceras{
    private Colores colorLucesTraceras;

    public Colores getColorLucesTraceras() {
        return colorLucesTraceras;
    }

    public void encenderLuces(){
        this.colorLucesTraceras = Colores.WHITE;
      }
    
    public void EncenderLuzFreno(){
        this.colorLucesTraceras = Colores.RED;
    }

    public LucesTraceras(Colores colorLucesTraceras) {
        this.colorLucesTraceras = Colores.WHITE;
    }
    
    
}
