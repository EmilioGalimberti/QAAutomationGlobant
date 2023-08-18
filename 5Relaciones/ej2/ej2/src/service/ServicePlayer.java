package service;

import entity.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicePlayer {
    public ArrayList<Player> players = new ArrayList<>();

    public ArrayList<Player> crearJugadores() {
        System.out.println("Cuantos jugadores seran?");
        Scanner scanner = new Scanner(System.in);
        int cantidadJugadores = scanner.nextInt();
        int id = 0;
        if(cantidadJugadores < 1){ cantidadJugadores = 6;}
        if (cantidadJugadores <= 6) {
            do {
                id += 1;
                String name = "Jugador" + id;
                players.add(new Player(id, name));
            } while (id != cantidadJugadores);
            return players;
        }else {System.out.println("Solo se puede un maximo de 6 jugadores");}
        return null;
    }

}
