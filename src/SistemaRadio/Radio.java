/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author wesrm
 */
public class Radio {
    private boolean encendido;
    private ModoRadio modo;
    
    public void encender(){
        this.encendido = true;
    }
    
    public void apagar(){
        this.encendido = false;
    }
    
    public void cambiarModo(String nuevoModo){
                if (modo == ModoRadio.AM) {
            modo = ModoRadio.FM;
        } else if (modo == ModoRadio.FM) {
            modo = ModoRadio.BLUETOOTH;
        } else if (modo == ModoRadio.BLUETOOTH) {
            modo = ModoRadio.AM;
        }
    }

    public ModoRadio getModo() {
        return modo;
    }

    public Radio(boolean encendido) {
        this.encendido = encendido;
        this.modo = modo;
    }

    
    
    
}

