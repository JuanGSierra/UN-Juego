/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author macas
 */
public class Player implements Serializable {

    private static int numberOfPlayers = 0;
    private String name;
    private Villager[] villagers;
    private int id = 0;
    private int score;
    private int numberOfMovements;
    private boolean hasThrowDice;

    public Player(String name, ArrayList<JLabel> jlabels) {

        this.name = name;
        this.score = 0;
        numberOfMovements = 3;
        hasThrowDice = false;

        villagers = new Villager[10];
        villagers[0] = new Villager(1, id, jlabels.get(0));
        villagers[1] = new Villager(1, id, jlabels.get(1));
        villagers[2] = new Villager(1, id, jlabels.get(2));
        villagers[3] = new Villager(2, id, jlabels.get(3));
        villagers[4] = new Villager(2, id, jlabels.get(4));
        villagers[5] = new Villager(3, id, jlabels.get(5));
        villagers[6] = new Villager(3, id, jlabels.get(6));
        villagers[7] = new Villager(4, id, jlabels.get(7));
        villagers[8] = new Villager(5, id, jlabels.get(8));
        villagers[9] = new Villager(6, id, jlabels.get(9));
        numberOfPlayers++;
        id = numberOfPlayers;
    }

    public boolean isHasThrowDice() {
        return hasThrowDice;
    }

    public void setHasThrowDice(boolean hasThrowDice) {
        this.hasThrowDice = hasThrowDice;
    }

    public void reinitializeMovements() {
        this.numberOfMovements = 3;
    }

    public int getNumberOfMovements() {
        return numberOfMovements;
    }

    public void setNumberOfMovements(int numberOfMovements) {

        switch (numberOfMovements) {
            case 1:
                this.numberOfMovements = this.numberOfMovements - 1;
                break;
            case 2:
                this.numberOfMovements = this.numberOfMovements - 2;
                break;
            case 3:
                this.numberOfMovements = this.numberOfMovements - 3;
                break;
        }

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
