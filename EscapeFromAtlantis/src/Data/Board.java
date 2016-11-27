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
    static final int MOUNTAINTILEQUANTITY = 16;

    private Tile[][] board;
    
    public Board(){
        board = new Tile[13][25];
        board[0][2]= new FinishTile(1); // finish tiles
        board[1][1]= new FinishTile(1);
        board[2][0]= new FinishTile(1);
        
        board[0][22]= new FinishTile(1);
        board[1][23]= new FinishTile(1);
        board[2][24]= new FinishTile(1);
        
        board[10][0]= new FinishTile(1);
        board[11][1]= new FinishTile(1);
        board[12][2]= new FinishTile(1);
        
        board[10][24]= new FinishTile(1);
        board[11][23]= new FinishTile(1);
        board[12][22]= new FinishTile(1);
        
        
        board[0][6]= new WaterTile(1, true); // water tiles
        board[0][8]= new WaterTile(1, true);
        board[0][10]= new WaterTile(1, true);
        board[0][12]= new WaterTile(1, true);
        board[0][14]= new WaterTile(1, true);
        board[0][16]= new WaterTile(1, true);
        board[0][18]= new WaterTile(1, true);
        
        board[1][3]= new WaterTile(1, true);
        board[1][5]= new WaterTile(1, true);
        board[1][7]= new WaterTile(1, true);
        board[1][9]= new WaterTile(1, true);
        board[1][11]= new WaterTile(1, true);
        board[1][13]= new WaterTile(1, true);
        board[1][15]= new WaterTile(1, true);
        board[1][17]= new WaterTile(1, true);
        board[1][19]= new WaterTile(1, true);
        board[1][21]= new WaterTile(1, true);
        
        board[2][2]= new WaterTile(1, true);
        board[2][4]= new WaterTile(1, true);
        board[2][6]= new WaterTile(1, true);
        board[2][8]= new WaterTile(1, true);
        board[2][10]= new WaterTile(1, true);
        board[2][12]= new WaterTile(1, true);
        board[2][14]= new WaterTile(1, true);
        board[2][16]= new WaterTile(1, true);
        board[2][18]= new WaterTile(1, true);
        board[2][20]= new WaterTile(1, true);
        board[2][22]= new WaterTile(1, true);
        
        board[3][3]= new WaterTile(1, true);
        board[3][5]= new WaterTile(1, true);
        board[3][7]= new WaterTile(1, true);
        board[3][19]= new WaterTile(1, true);
        board[3][21]= new WaterTile(1, true);
        
        board[4][2]= new WaterTile(1, true);
        board[4][4]= new WaterTile(1, true);
        board[4][20]= new WaterTile(1, true);
        board[4][22]= new WaterTile(1, true);
        
        board[5][1]= new WaterTile(1, true);
        board[5][3]= new WaterTile(1, true);
        board[5][21]= new WaterTile(1, true);
        board[5][23]= new WaterTile(1, true);
        
        board[6][2]= new WaterTile(1, true);
        board[6][12]= new WaterTile(1, true);
        board[6][22]= new WaterTile(1, true);
        
        board[7][1]= new WaterTile(1, true);
        board[7][3]= new WaterTile(1, true);
        board[7][21]= new WaterTile(1, true);
        board[7][23]= new WaterTile(1, true);
        
        board[8][2]= new WaterTile(1, true);
        board[8][4]= new WaterTile(1, true);
        board[8][20]= new WaterTile(1, true);
        board[8][22]= new WaterTile(1, true);
        
        board[9][3]= new WaterTile(1, true);
        board[9][5]= new WaterTile(1, true);
        board[9][17]= new WaterTile(1, true);
        board[9][19]= new WaterTile(1, true);
        board[9][21]= new WaterTile(1, true);
        
        board[10][2]= new WaterTile(1, true);
        board[10][4]= new WaterTile(1, true);
        board[10][6]= new WaterTile(1, true);
        board[10][8]= new WaterTile(1, true);
        board[10][10]= new WaterTile(1, true);
        board[10][12]= new WaterTile(1, true);
        board[10][14]= new WaterTile(1, true);
        board[10][16]= new WaterTile(1, true);
        board[10][18]= new WaterTile(1, true);
        board[10][20]= new WaterTile(1, true);
        board[10][22]= new WaterTile(1, true);
        
        board[11][3]= new WaterTile(1, true);
        board[11][5]= new WaterTile(1, true);
        board[11][7]= new WaterTile(1, true);
        board[11][9]= new WaterTile(1, true);
        board[11][11]= new WaterTile(1, true);
        board[11][13]= new WaterTile(1, true);
        board[11][15]= new WaterTile(1, true);
        board[11][17]= new WaterTile(1, true);
        board[11][19]= new WaterTile(1, true);
        board[11][21]= new WaterTile(1, true);
        
        board[12][6]= new WaterTile(1, true);
        board[12][8]= new WaterTile(1, true);
        board[12][10]= new WaterTile(1, true);
        board[12][12]= new WaterTile(1, true);
        board[12][14]= new WaterTile(1, true);
        board[12][16]= new WaterTile(1, true);
        board[12][18]= new WaterTile(1, true);
        
        
        board[3][17]= new SandTile(1, true, "");// sand tiles
        
        board[4][6]= new SandTile(1, true, "");
        board[4][18]= new SandTile(1, true, "");
        
        board[5][5]= new SandTile(1, true, "");
        board[5][19]= new SandTile(1, true, "");
        
        board[6][4]= new SandTile(1, true, "");
        board[6][6]= new SandTile(1, true, "");
        board[6][8]= new SandTile(1, true, "");
        board[6][16]= new SandTile(1, true, "");
        board[6][18]= new SandTile(1, true, "");
        board[6][20]= new SandTile(1, true, "");
        
        board[7][5]= new SandTile(1, true, "");
        board[7][19]= new SandTile(1, true, "");
        
        board[8][6]= new SandTile(1, true, "");
        board[8][18]= new SandTile(1, true, "");
        
        board[9][7]= new SandTile(1, true, "");
        
        
        board[3][9]= new ForestTile(1, true, "");//forest tiles
        board[3][11]= new ForestTile(1, true, "");
        board[3][13]= new ForestTile(1, true, "");
        board[3][15]= new ForestTile(1, true, "");
        
        board[4][8]= new ForestTile(1, true, "");
        board[4][16]= new ForestTile(1, true, "");
        
        board[5][7]= new ForestTile(1, true, "");
        board[5][17]= new ForestTile(1, true, "");
        
        board[7][7]= new ForestTile(1, true, "");
        board[7][17]= new ForestTile(1, true, "");
        
        board[8][8]= new ForestTile(1, true, "");
        board[8][16]= new ForestTile(1, true, "");
        
        board[9][9]= new ForestTile(1, true, "");
        board[9][11]= new ForestTile(1, true, "");
        board[9][13]= new ForestTile(1, true, "");
        board[9][15]= new ForestTile(1, true, "");
        
        
        board[4][10]= new MountainTile(1, true, "");//mountain tiles
        board[4][12]= new MountainTile(1, true, "");
        board[4][14]= new MountainTile(1, true, "");
        
        board[5][9]= new MountainTile(1, true, "");
        board[5][11]= new MountainTile(1, true, "");
        board[5][13]= new MountainTile(1, true, "");
        board[5][15]= new MountainTile(1, true, "");
        
        board[6][10]= new MountainTile(1, true, "");
        board[6][14]= new MountainTile(1, true, "");
        
        board[7][9]= new MountainTile(1, true, "");
        board[7][11]= new MountainTile(1, true, "");
        board[7][13]= new MountainTile(1, true, "");
        board[7][15]= new MountainTile(1, true, "");
        
        board[8][10]= new MountainTile(1, true, "");
        board[8][12]= new MountainTile(1, true, "");
        board[8][14]= new MountainTile(1, true, "");
        
        
    }
    
    public static void main(String[] args){
        Board tableroPrueba = new Board();
        imprimirTableroPrueba(tableroPrueba);
    }
    
    private static void imprimirTableroPrueba(Board tablero) {
        for (int i = 0; i < tablero.board.length; i++) {
            for (int j = 0; j < tablero.board[0].length; j++) {
                System.out.print("[");
                if(tablero.board[i][j] instanceof WaterTile){
                    System.out.print("W");
                }else if(tablero.board[i][j] instanceof SandTile){
                    System.out.print("S");
                }else if(tablero.board[i][j] instanceof ForestTile){
                    System.out.print("F");
                }else if (tablero.board[i][j] instanceof MountainTile) {
                    System.out.print("M");
                }else if(tablero.board[i][j] instanceof FinishTile){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
                System.out.print("]");
            }
            System.out.println("");
        }
    }

}
