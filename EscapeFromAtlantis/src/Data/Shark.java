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
public class Shark extends Animal implements Serializable {

    public Shark(int position) {
        super(position, 2, "Shark");
    }

    //tiburon no destruye barcos pero si come nadadores
    @Override
    public void doEffect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
