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
public class Board implements Serializable {

    static final int WATERTILEQUANTITY = 133;
    static final int SALVATIONTILEQUANTITY = 12;
    static final int SANDTILEQUANTITY = 16;
    static final int FORESTTILEQUANTITY = 16;
    static final int MOUNTAINTILEQUANTITY = 8;

    private Player player1;
    private Player player2;
    private Box<Tile> box[][];
    private String[][] board;

    public Board(MountainTile mountain, ForestTile forest, SandTile sand,
            WaterTile water, FinishTile finish) {
        board = new String[5][5];
        board[0][0] = finish.getInside();
        board[0][1] = water.getInside();
        board[0][2] = sand.getInside();
        board[0][3] = sand.getInside();
        board[0][4] = water.getInside();
        board[1][0] = water.getInside();
        board[1][1] = sand.getInside();
        board[1][2] = forest.getInside();
        board[1][3] = mountain.getInside();
        board[1][4] = forest.getInside();
        board[2][0] = water.getInside();
        board[2][1] = sand.getInside();
        board[2][2] = forest.getInside();
        board[2][3] = mountain.getInside();
        board[2][4] = forest.getInside();
        board[3][0] = water.getInside();
        board[3][1] = sand.getInside();
        board[3][2] = forest.getInside();
        board[3][3] = sand.getInside();
        board[3][4] = water.getInside();
        board[4][0] = finish.getInside();
        board[4][1] = water.getInside();
        board[4][2] = sand.getInside();
        board[4][3] = sand.getInside();
        board[4][4] = water.getInside();

    }

    public void printBoard(Player player1, Player player2) {

        box = new Box[13][25];

        //salvacion Esquina izquierda superior
        box[0][2].setT(new FinishTile(1));
        box[1][1].setT(new FinishTile(10));
        box[2][0].setT(new FinishTile(22));
        //salvacion Esquina derecha superior
        box[0][22].setT(new FinishTile(9));
        box[1][23].setT(new FinishTile(19));
        box[2][24].setT(new FinishTile(30));
        //salvacion esquina inferior izquierda
        box[10][0].setT(new FinishTile(112));
        box[11][1].setT(new FinishTile(124));
        box[12][2].setT(new FinishTile(136));
        //salvacion esquina inferior derecha
        box[10][24].setT(new FinishTile(123));
        box[11][23].setT(new FinishTile(135));
        box[12][22].setT(new FinishTile(144));
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public Box<Tile>[][] getBox() {
        return box;
    }

}
