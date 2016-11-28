/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author macas
 */
public class Villager {

    private int value;
    private boolean inWater;
    private int idPlayer;
    private int x;
    private int y;
    private int nextX;
    private int nextY;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNextX() {
        return nextX;
    }

    public void setNextX(int nextX) {
        this.nextX = nextX;
    }

    public int getNextY() {
        return nextY;
    }

    public void setNextY(int nextY) {
        this.nextY = nextY;
    }
    
    // Posicion del villager dentro del mapa
    private JLabel jlabel;

    public Villager(int value, int idPlayer, JLabel jlabel) {
        this.value = value;
        this.idPlayer = idPlayer;
        inWater = false;
        this.jlabel = jlabel;
    }

    public JLabel getJlabel() {
        return jlabel;
    }

    public void setJlabel(JLabel jlabel) {
        this.jlabel = jlabel;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isInWater() {
        return inWater;
    }

    public void setInWater(boolean inWater) {
        this.inWater = inWater;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }
    

}
