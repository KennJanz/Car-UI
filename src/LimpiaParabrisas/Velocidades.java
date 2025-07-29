/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package LimpiaParabrisas;

/**
 *
 * @author wesrm
 */
public enum Velocidades {
    APAGADO(0),BAJA(1),MEDIA(2),ALTA(3);
    
    private final int velocidad;

    private Velocidades(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "velocidades{" + "ordinal=" + ordinal() + ", name=" + name() + ", velocidad=" + velocidad + '}';
    }
    
    
}
