package service;

import entity.Revolver;

import java.util.Random;

public class ServiceRevolver {
    private final Revolver  revolver = new Revolver();

    public Revolver llenarRevolver(){
        Random random = new Random();
        revolver.setPosicionActual(random.nextInt(0,7));
        revolver.setPosicionDisparo(random.nextInt(0,7));
        return revolver;
    }

    public boolean matar(){
        return revolver.getPosicionActual() == revolver.getPosicionDisparo();
    }

    public void siguienteDisparo(){
        if (revolver.getPosicionActual() == 6){
            revolver.setPosicionActual(0);
        }
        else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
    }

    public int getPosicionActual(){
        return revolver.getPosicionActual();
    }

    public int getPosicionDisparo(){
        return revolver.getPosicionDisparo();
    }
    @Override
    public String toString() {
        return "ServiceRevolver{" +
                "revolver=" + revolver +
                '}';
    }
}
