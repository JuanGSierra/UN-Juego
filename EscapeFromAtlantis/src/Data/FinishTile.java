/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author johans
 */
public class FinishTile extends Tile implements Serializable{

    private String inside;

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }
    
    public FinishTile(int position) {
        super(position, true, "Player saved token");
        inside = "-";
    }
    
    public void printFinishTile(FinishTile x){
        System.out.print(x.inside);
    }
    
    
    

}
