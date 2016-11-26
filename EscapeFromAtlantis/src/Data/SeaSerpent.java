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
public class SeaSerpent extends Animal implements Serializable {

    public SeaSerpent(int position) {
        super(position, 1, "Sea Serpent");

    }

    //serpiente marina destruye barcos y se come a los pasajeros
    @Override
    public void doEffect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
