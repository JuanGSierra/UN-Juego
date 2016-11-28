/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author macas
 */
public abstract class Tile implements Serializable {

    private boolean inBoard;
    private final int MAXPLAYERQUANTITY = 3;
    private String effect;
    private int position;
    private ArrayList<Villager> villager;
    private int aldeanosActuales;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getAldeanosActuales() {
        return aldeanosActuales;
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

    public boolean isInBoard() {
        return inBoard;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Tile(int position, int x, int y, boolean inBoard, String effect) {
        this.position = position;
        this.inBoard = inBoard;
        this.effect = effect;
        villager = new ArrayList();
        aldeanosActuales = 0;
        this.x=x;
        this.y=y;
    }

    public void removeTile() {
        this.inBoard = false;
    }

    public void agregarVillager(Villager v) {
        if (aldeanosActuales == (MAXPLAYERQUANTITY)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        villager.add(v);
        aldeanosActuales++;
    }

    public void eliminarVillager(Villager v) {

        if (villager.remove(v)) {
            aldeanosActuales--;
        } else {
            
        }

    }

}
