package entity;

import service.ServiceRevolver;

public class Player {
    int id;
    String name;
    boolean dead;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.dead = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean disparo(ServiceRevolver revolver){
        boolean muerto = revolver.matar();
        if (muerto){
            this.dead = true;
            return true;
        }
        else {
            revolver.siguienteDisparo();
            return false;
        }
    }
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dead=" + dead +
                '}';
    }
}
