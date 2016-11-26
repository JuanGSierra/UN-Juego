/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author macas
 */
public class Player implements Serializable {

    private static int numberOfPlayers = 0;
    private String name;
    private Villager[] villagers;
    private int id = 0;

    public Player(String name) {

        this.name = name;
        villagers = new Villager[10];
        villagers[0] = new Villager(1, id);
        villagers[1] = new Villager(1, id);
        villagers[2] = new Villager(1, id);
        villagers[3] = new Villager(2, id);
        villagers[4] = new Villager(2, id);
        villagers[5] = new Villager(3, id);
        villagers[6] = new Villager(3, id);
        villagers[7] = new Villager(4, id);
        villagers[8] = new Villager(5, id);
        villagers[9] = new Villager(6, id);
        numberOfPlayers++;
        id = numberOfPlayers;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Villager[] getVillagers() {
        return villagers;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
