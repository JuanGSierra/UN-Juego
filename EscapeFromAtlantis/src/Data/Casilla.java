/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import javax.swing.JLabel;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public class Casilla {
    private JLabel label;
    private Tile tile;

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Casilla(JLabel label, Tile tile) {
        this.label = label;
        this.tile = tile;
    }
    
    
}
