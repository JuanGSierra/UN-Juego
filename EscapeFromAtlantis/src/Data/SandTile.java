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
public class SandTile extends Tile implements Serializable{

    private String inside;

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }
    
    public SandTile(int position, boolean inBoard, String effect) {
        super(position, true, effect);
        inside = "=";
    }
    
    public void printSandTile(SandTile x){
        System.out.print(x.inside);
    }

}
