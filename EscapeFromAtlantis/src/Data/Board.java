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
        board[1][1]= new FinishTile(10);
        board[2][0]= new FinishTile(22);
        
        board[0][22]= new FinishTile(9);
        board[1][23]= new FinishTile(21);
        board[2][24]= new FinishTile(34);
        
        board[10][0]= new FinishTile(112);
        board[11][1]= new FinishTile(125);
        board[12][2]= new FinishTile(137);
        
        board[10][24]= new FinishTile(124);
        board[11][23]= new FinishTile(136);
        board[12][22]= new FinishTile(145);
        
        
        board[0][6]= new WaterTile(2, true); // water tiles
        board[0][8]= new WaterTile(3, true);
        board[0][10]= new WaterTile(4, true);
        board[0][12]= new WaterTile(5, true);
        board[0][14]= new WaterTile(6, true);
        board[0][16]= new WaterTile(7, true);
        board[0][18]= new WaterTile(8, true);
        
        board[1][3]= new WaterTile(11, true);
        board[1][5]= new WaterTile(12, true);
        board[1][7]= new WaterTile(13, true);
        board[1][9]= new WaterTile(14, true);
        board[1][11]= new WaterTile(15, true);
        board[1][13]= new WaterTile(16, true);
        board[1][15]= new WaterTile(17, true);
        board[1][17]= new WaterTile(18, true);
        board[1][19]= new WaterTile(19, true);
        board[1][21]= new WaterTile(20, true);
        
        board[2][2]= new WaterTile(23, true);
        board[2][4]= new WaterTile(24, true);
        board[2][6]= new WaterTile(25, true);
        board[2][8]= new WaterTile(26, true);
        board[2][10]= new WaterTile(27, true);
        board[2][12]= new WaterTile(28, true);
        board[2][14]= new WaterTile(29, true);
        board[2][16]= new WaterTile(30, true);
        board[2][18]= new WaterTile(31, true);
        board[2][20]= new WaterTile(32, true);
        board[2][22]= new WaterTile(33, true);
        
        board[3][3]= new WaterTile(35, true);
        board[3][5]= new WaterTile(36, true);
        board[3][7]= new WaterTile(37, true);
        board[3][19]= new WaterTile(43, true);
        board[3][21]= new WaterTile(44, true);
        
        board[4][2]= new WaterTile(45, true);
        board[4][4]= new WaterTile(46, true);
        board[4][20]= new WaterTile(54, true);
        board[4][22]= new WaterTile(55, true);
        
        board[5][1]= new WaterTile(56, true);
        board[5][3]= new WaterTile(57, true);
        board[5][21]= new WaterTile(66, true);
        board[5][23]= new WaterTile(67, true);
        
        board[6][2]= new WaterTile(68, true);
        board[6][12]= new WaterTile(73, true);
        board[6][22]= new WaterTile(78, true);
        
        board[7][1]= new WaterTile(79, true);
        board[7][3]= new WaterTile(80, true);
        board[7][21]= new WaterTile(89, true);
        board[7][23]= new WaterTile(90, true);
        
        board[8][2]= new WaterTile(91, true);
        board[8][4]= new WaterTile(92, true);
        board[8][20]= new WaterTile(100, true);
        board[8][22]= new WaterTile(101, true);
        
        board[9][3]= new WaterTile(102, true);
        board[9][5]= new WaterTile(103, true);
        board[9][17]= new WaterTile(109, true);
        board[9][19]= new WaterTile(110, true);
        board[9][21]= new WaterTile(111, true);
        
        board[10][2]= new WaterTile(113, true);
        board[10][4]= new WaterTile(114, true);
        board[10][6]= new WaterTile(115, true);
        board[10][8]= new WaterTile(116, true);
        board[10][10]= new WaterTile(117, true);
        board[10][12]= new WaterTile(118, true);
        board[10][14]= new WaterTile(119, true);
        board[10][16]= new WaterTile(120, true);
        board[10][18]= new WaterTile(121, true);
        board[10][20]= new WaterTile(122, true);
        board[10][22]= new WaterTile(123, true);
        
        board[11][3]= new WaterTile(126, true);
        board[11][5]= new WaterTile(127, true);
        board[11][7]= new WaterTile(128, true);
        board[11][9]= new WaterTile(129, true);
        board[11][11]= new WaterTile(130, true);
        board[11][13]= new WaterTile(131, true);
        board[11][15]= new WaterTile(132, true);
        board[11][17]= new WaterTile(133, true);
        board[11][19]= new WaterTile(134, true);
        board[11][21]= new WaterTile(135, true);
        
        board[12][6]= new WaterTile(138, true);
        board[12][8]= new WaterTile(139, true);
        board[12][10]= new WaterTile(140, true);
        board[12][12]= new WaterTile(141, true);
        board[12][14]= new WaterTile(142, true);
        board[12][16]= new WaterTile(143, true);
        board[12][18]= new WaterTile(144, true);
        
        
        board[3][17]= new SandTile(42, true, "");// sand tiles
        
        board[4][6]= new SandTile(47, true, "");
        board[4][18]= new SandTile(53, true, "");
        
        board[5][5]= new SandTile(58, true, "mover tiburon");
        board[5][19]= new SandTile(65, true, "");
        
        board[6][4]= new SandTile(69, true, "mover ballena");
        board[6][6]= new SandTile(70, true, "");
        board[6][8]= new SandTile(71, true, "mover serpiente");
        board[6][16]= new SandTile(75, true, "mover serpiente");
        board[6][18]= new SandTile(76, true, "");
        board[6][20]= new SandTile(77, true, "mover ballena");
        
        board[7][5]= new SandTile(81, true, "");
        board[7][19]= new SandTile(88, true, "mover tiburon");
        
        board[8][6]= new SandTile(93, true, "");
        board[8][18]= new SandTile(99, true, "");
        
        board[9][7]= new SandTile(104, true, "mover tiburon");
        
        
        board[3][9]= new ForestTile(38, true, "");//forest tiles
        board[3][11]= new ForestTile(39, true, "mover ballena");
        board[3][13]= new ForestTile(40, true, "");
        board[3][15]= new ForestTile(41, true, "");
        
        board[4][8]= new ForestTile(48, true, "");
        board[4][16]= new ForestTile(52, true, "");
        
        board[5][7]= new ForestTile(59, true, "mover serpiente");
        board[5][17]= new ForestTile(64, true, "mover tiburon");
        
        board[7][7]= new ForestTile(82, true, "");
        board[7][17]= new ForestTile(87, true, "mover tiburon");
        
        board[8][8]= new ForestTile(94, true, "");
        board[8][16]= new ForestTile(98, true, "");
        
        board[9][9]= new ForestTile(105, true, "");
        board[9][11]= new ForestTile(106, true, "mover serpiente");
        board[9][13]= new ForestTile(107, true, "mover ballena");
        board[9][15]= new ForestTile(108, true, "");
        
        
        board[4][10]= new MountainTile(49, true, "");//mountain tiles
        board[4][12]= new MountainTile(50, true, "");
        board[4][14]= new MountainTile(51, true, "");
        
        board[5][9]= new MountainTile(60, true, "volcan");
        board[5][11]= new MountainTile(61, true, "");
        board[5][13]= new MountainTile(62, true, "mover serpiente");
        board[5][15]= new MountainTile(63, true, "mover ballena");
        
        board[6][10]= new MountainTile(72, true, "");
        board[6][14]= new MountainTile(74, true, "");
        
        board[7][9]= new MountainTile(83, true, "mover ballena");
        board[7][11]= new MountainTile(84, true, "");
        board[7][13]= new MountainTile(85, true, "mover tiburon");
        board[7][15]= new MountainTile(86, true, "");
        
        board[8][10]= new MountainTile(95, true, "");
        board[8][12]= new MountainTile(96, true, "mover serpiente");
        board[8][14]= new MountainTile(97, true, "");
    }
    
    
    
    private static void imprimirTableroPrueba(Board tablero) {
        int s = 0;
        for (int i = 0; i < tablero.board.length; i++) {
            for (int j = 0; j < tablero.board[0].length; j++) {
                System.out.print("[");
                if(tablero.board[i][j] instanceof WaterTile){
                    System.out.print("W"+ ++s);
                }else if(tablero.board[i][j] instanceof SandTile){
                    System.out.print("S"+ ++s);
                }else if(tablero.board[i][j] instanceof ForestTile){
                    System.out.print("F"+ ++s);
                }else if (tablero.board[i][j] instanceof MountainTile) {
                    System.out.print("M"+ ++s);
                }else if(tablero.board[i][j] instanceof FinishTile){
                    System.out.print("X"+ ++s);
                }else{
                    System.out.print("    ");
                }
                System.out.print("]"+"\t");
            }
            System.out.println("");
        }
    }

}
