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

    public Animal(int position, int movementAlowed, String name) {
        this.name = name;
        this.position = position;
        this.movementAlowed = movementAlowed;

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
