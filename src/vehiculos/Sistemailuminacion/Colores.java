/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Sistemailuminacion;

import java.awt.Color;

/**
 *
 * @author unknown
 */
public enum Colores {
    RED(Color.RED),
    YELLOW(Color.YELLOW),
    WHITE(Color.WHITE),
    BLACK(Color.BLACK);
    
    private Color EleccionColor;

    public Color getEleccionColor() {
        return EleccionColor;
    }

    private Colores(Color EleccionColor) {
        this.EleccionColor = EleccionColor;
    }
    
}
