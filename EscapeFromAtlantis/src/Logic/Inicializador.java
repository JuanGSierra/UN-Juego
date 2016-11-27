/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.GraphicsUI;

/**
 *
 * @author johanr98 jsromerod@unal.edu.co
 */
public class Inicializador {
    
    static GameMaster gm;
    
    public static void main(String[] argv){
        gm= new GameMaster(new GraphicsUI());
    }
}
