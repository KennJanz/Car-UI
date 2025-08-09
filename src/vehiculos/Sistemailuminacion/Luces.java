package Sistemailuminacion;

public class Luces {
    private boolean encendida;
    private Colores color;

    public Luces encender() {
        this.encendida = true;
        return this;
    }

    public Luces apagar() {
        this.encendida = false;
        return this;
    }

    public boolean estaEncendida() {
        return encendida;
    }

    public void cambiarColor(Colores nuevoColor) {
        this.color = nuevoColor;
    }

    public Colores getColor() {
        return color;
    }
    
    public Luces(Colores colorInicial) {
        this.color = colorInicial;
        this.encendida = false;
    }
    
}
