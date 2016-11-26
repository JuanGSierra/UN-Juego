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
public class Whale extends Animal implements Serializable {

    public Whale(int position) {
        super(position, 3, "Whale");
    }

    //ballena destruye barcos pero no puede comerse a los nadadores
    @Override
    public void doEffect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
