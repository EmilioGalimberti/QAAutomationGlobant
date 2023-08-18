package entity;


import service.ServiceRevolver;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    public ArrayList<Player> players ;
    public Revolver revolver;

    public void llenarJuego(ArrayList<Player> players, Revolver revolver){
        this.players = players;
        this.revolver = revolver;
    }

    public void ronda(ServiceRevolver serviceRevolver){
        while (true) {
            for (Player jugador : players) {
                System.out.println(jugador);
                if (jugador.disparo(serviceRevolver)) {
                    System.out.println("¡" + jugador + " se mojó!");
                    System.out.println("Termino el juego");
                    System.out.println(revolver);
                    return;
                }
            }
        }
    }

}
