package entity;

public class Revolver {
    int posicionActual;
    int posicionDisparo;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDisparo() {
        return posicionDisparo;
    }

    public void setPosicionDisparo(int posicionDisparo) {
        this.posicionDisparo = posicionDisparo;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionDisparo=" + posicionDisparo +
                '}';
    }
}
