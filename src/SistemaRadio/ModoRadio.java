/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author wesrm
 */
public enum ModoRadio {
    AM("Am"),FM("Fm"),BLUETOOTH("Bluetooth");
    
    private final String modo;

    private ModoRadio(String modo) {
        this.modo = modo;
    }

    @Override
    public String toString() {
        return "ModoRadio{" + "ordinal=" + ordinal() + ", name=" + name() + ", modo=" + modo + '}';
    }
    
    
}
