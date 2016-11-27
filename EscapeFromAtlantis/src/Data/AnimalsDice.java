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
public class AnimalsDice implements Serializable{

    private String name;
    private String face1;
    private String face2;
    private String face3;
    private String face4;
    private String face5;
    private String face6;

    public AnimalsDice() {
        face1 = "Shark";
        face2 = "SeaSerpent";
        face3 = "Whale";
        face4 = "Whale";
        face5 = "SeaSerpent";
        face6 = "Shark";

    }

    public String throwDice() {
        Random r = new Random();

        switch (r.nextInt(5)) {
            case 0:
                System.out.println(1);
                return face1;

            case 1:
                System.out.println(2);
                return face2;
            case 2:
                System.out.println(3);
                return face3;
            case 3:
                System.out.println(4);
                return face4;
            case 4:
                System.out.println(5);
                return face5;
            case 5:
                System.out.println(6);
                return face6;
            default:
                System.out.println(7);
                return face6;
        }
    }

}
