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
public abstract class Animal implements Serializable {

    private String name;
    private int position;
    private int movementAlowed;
    private int x;
    private int y;
    private int nextX;
    private int nextY;
    

    public Animal(int position, int movementAlowed, String name) {
        this.name = name;
        this.position = position;
        this.movementAlowed = movementAlowed;

    }

    public Animal(int x, int y, int nextX, int nextY) {
        this.x = x;
        this.y = y;
        this.nextX = nextX;
        this.nextY = nextY;
    }
    

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

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMovementAlowed(int movementAlowed) {
        this.movementAlowed = movementAlowed;
    }

    public int getPosition() {
        return position;
    }

    public int getMovementAlowed() {
        return movementAlowed;
    }

    public abstract void doEffect();

}
