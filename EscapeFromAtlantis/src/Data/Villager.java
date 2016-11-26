/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author macas
 */
public class Villager implements Serializable {

    private int value;
    private boolean inWater;

    public Villager(int value) {
        this.value = value;
        inWater = false;
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

}
