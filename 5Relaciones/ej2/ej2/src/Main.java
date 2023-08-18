import entity.Game;
import entity.Player;
import entity.Revolver;
import service.ServicePlayer;
import service.ServiceRevolver;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServiceRevolver serviceRevolver = new ServiceRevolver();
        ServicePlayer player = new ServicePlayer();
        Revolver revolver = serviceRevolver.llenarRevolver();
        ArrayList<Player> players = player.crearJugadores();
        Game game = new Game();
        game.llenarJuego(players,revolver);
        System.out.println(serviceRevolver);
        game.ronda(serviceRevolver);

    }
}