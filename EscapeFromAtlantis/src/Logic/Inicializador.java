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

    // Inicializa el juego
    public static void main(String args[]) {
        GameMaster gameMaster = new GameMaster();
        gameMaster.run();
    }

}