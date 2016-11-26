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
    private int id;

    public Player(String name) {

        this.name = name;

        villagers = new Villager[10];

        villagers[0] = new Villager(1);
        villagers[1] = new Villager(1);
        villagers[2] = new Villager(1);
        villagers[3] = new Villager(2);
        villagers[4] = new Villager(2);
        villagers[5] = new Villager(3);
        villagers[6] = new Villager(3);
        villagers[7] = new Villager(4);
        villagers[8] = new Villager(5);
        villagers[9] = new Villager(6);

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
