/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logic.GameMaster;
import javax.swing.JLabel;

/**
 *
 * @author johans
 */
public class VillagerCenters {

    private PixelPoint centermat[][];
    private GameMaster gameMaster;

    public VillagerCenters(GameMaster gameMaster) {
        centermat = new PixelPoint[13][25];
        this.gameMaster = gameMaster;

        centermat[0][2] = new PixelPoint(280, 36);
        centermat[0][6] = new PixelPoint(375, 36);
        centermat[0][8] = new PixelPoint(425, 36);
        centermat[0][10] = new PixelPoint(470, 36);
        centermat[0][12] = new PixelPoint(520, 36);
        centermat[0][14] = new PixelPoint(560, 36);
        centermat[0][16] = new PixelPoint(615, 36);
        centermat[0][18] = new PixelPoint(660, 36);
        centermat[0][22] = new PixelPoint(755, 36);

        centermat[1][1] = new PixelPoint(255, 80);
        centermat[1][3] = new PixelPoint(305, 80);
        centermat[1][5] = new PixelPoint(350, 80);
        centermat[1][7] = new PixelPoint(400, 80);
        centermat[1][9] = new PixelPoint(450, 80);
        centermat[1][11] = new PixelPoint(495, 80);
        centermat[1][13] = new PixelPoint(545, 80);
        centermat[1][15] = new PixelPoint(590, 80);
        centermat[1][17] = new PixelPoint(640, 80);
        centermat[1][19] = new PixelPoint(685, 80);
        centermat[1][21] = new PixelPoint(735, 80);
        centermat[1][23] = new PixelPoint(785, 80);

        centermat[2][0] = new PixelPoint(230, 120);
        centermat[2][2] = new PixelPoint(280, 120);
        centermat[2][4] = new PixelPoint(325, 120);
        centermat[2][6] = new PixelPoint(375, 120);
        centermat[2][8] = new PixelPoint(425, 120);
        centermat[2][10] = new PixelPoint(470, 120);
        centermat[2][12] = new PixelPoint(520, 120);
        centermat[2][14] = new PixelPoint(565, 120);
        centermat[2][16] = new PixelPoint(615, 120);
        centermat[2][18] = new PixelPoint(660, 120);
        centermat[2][20] = new PixelPoint(710, 120);
        centermat[2][22] = new PixelPoint(760, 120);
        centermat[2][24] = new PixelPoint(810, 120);

        centermat[3][3] = new PixelPoint(305, 160);
        centermat[3][5] = new PixelPoint(350, 160);
        centermat[3][7] = new PixelPoint(400, 160);
        centermat[3][9] = new PixelPoint(450, 160);
        centermat[3][11] = new PixelPoint(495, 160);
        centermat[3][13] = new PixelPoint(545, 160);
        centermat[3][15] = new PixelPoint(590, 160);
        centermat[3][17] = new PixelPoint(640, 160);
        centermat[3][19] = new PixelPoint(685, 160);
        centermat[3][21] = new PixelPoint(735, 160);

        centermat[4][2] = new PixelPoint(280, 205);
        centermat[4][4] = new PixelPoint(325, 205);
        centermat[4][6] = new PixelPoint(375, 205);
        centermat[4][8] = new PixelPoint(425, 205);
        centermat[4][10] = new PixelPoint(470, 205);
        centermat[4][12] = new PixelPoint(520, 205);
        centermat[4][14] = new PixelPoint(570, 205);
        centermat[4][16] = new PixelPoint(615, 205);
        centermat[4][18] = new PixelPoint(665, 205);
        centermat[4][20] = new PixelPoint(710, 205);
        centermat[4][22] = new PixelPoint(760, 205);

        centermat[5][1] = new PixelPoint(255, 250);
        centermat[5][3] = new PixelPoint(300, 250);
        centermat[5][5] = new PixelPoint(350, 250);
        centermat[5][7] = new PixelPoint(400, 250);
        centermat[5][9] = new PixelPoint(445, 250);
        centermat[5][11] = new PixelPoint(495, 250);
        centermat[5][13] = new PixelPoint(545, 250);
        centermat[5][15] = new PixelPoint(590, 250);
        centermat[5][17] = new PixelPoint(640, 250);
        centermat[5][19] = new PixelPoint(690, 250);
        centermat[5][21] = new PixelPoint(735, 250);
        centermat[5][23] = new PixelPoint(785, 250);

        centermat[6][2] = new PixelPoint(280, 285);
        centermat[6][4] = new PixelPoint(330, 285);
        centermat[6][6] = new PixelPoint(375, 285);
        centermat[6][8] = new PixelPoint(425, 285);
        centermat[6][10] = new PixelPoint(470, 285);
        centermat[6][12] = new PixelPoint(520, 285);
        centermat[6][14] = new PixelPoint(570, 285);
        centermat[6][16] = new PixelPoint(615, 285);
        centermat[6][18] = new PixelPoint(665, 285);
        centermat[6][20] = new PixelPoint(710, 285);
        centermat[6][22] = new PixelPoint(760, 285);

        centermat[7][1] = new PixelPoint(255, 325);
        centermat[7][3] = new PixelPoint(305, 325);
        centermat[7][5] = new PixelPoint(355, 325);
        centermat[7][7] = new PixelPoint(400, 325);
        centermat[7][9] = new PixelPoint(450, 325);
        centermat[7][11] = new PixelPoint(500, 325);
        centermat[7][13] = new PixelPoint(545, 325);
        centermat[7][15] = new PixelPoint(590, 325);
        centermat[7][17] = new PixelPoint(640, 325);
        centermat[7][19] = new PixelPoint(690, 325);
        centermat[7][21] = new PixelPoint(735, 325);
        centermat[7][23] = new PixelPoint(785, 325);

        centermat[8][2] = new PixelPoint(280, 325);
        centermat[8][4] = new PixelPoint(330, 365);
        centermat[8][6] = new PixelPoint(380, 365);
        centermat[8][8] = new PixelPoint(425, 365);
        centermat[8][10] = new PixelPoint(475, 365);
        centermat[8][12] = new PixelPoint(520, 365);
        centermat[8][14] = new PixelPoint(570, 365);
        centermat[8][16] = new PixelPoint(615, 365);
        centermat[8][18] = new PixelPoint(665, 365);
        centermat[8][20] = new PixelPoint(715, 365);
        centermat[8][22] = new PixelPoint(760, 365);

        centermat[9][3] = new PixelPoint(305, 415);
        centermat[9][5] = new PixelPoint(355, 415);
        centermat[9][7] = new PixelPoint(400, 415);
        centermat[9][9] = new PixelPoint(450, 415);
        centermat[9][11] = new PixelPoint(500, 415);
        centermat[9][13] = new PixelPoint(545, 415);
        centermat[9][15] = new PixelPoint(595, 415);
        centermat[9][17] = new PixelPoint(640, 415);
        centermat[9][19] = new PixelPoint(690, 415);
        centermat[9][21] = new PixelPoint(735, 415);

        centermat[10][0] = new PixelPoint(235, 455);
        centermat[10][2] = new PixelPoint(280, 455);
        centermat[10][4] = new PixelPoint(330, 455);
        centermat[10][6] = new PixelPoint(380, 455);
        centermat[10][8] = new PixelPoint(425, 455);
        centermat[10][10] = new PixelPoint(475, 455);
        centermat[10][12] = new PixelPoint(520, 455);
        centermat[10][14] = new PixelPoint(570, 455);
        centermat[10][16] = new PixelPoint(620, 455);
        centermat[10][18] = new PixelPoint(665, 455);
        centermat[10][20] = new PixelPoint(715, 455);
        centermat[10][22] = new PixelPoint(760, 455);
        centermat[10][24] = new PixelPoint(810, 455);

        centermat[11][1] = new PixelPoint(260, 495);
        centermat[11][3] = new PixelPoint(305, 495);
        centermat[11][5] = new PixelPoint(355, 495);
        centermat[11][7] = new PixelPoint(400, 495);
        centermat[11][9] = new PixelPoint(450, 495);
        centermat[11][11] = new PixelPoint(500, 495);
        centermat[11][13] = new PixelPoint(545, 495);
        centermat[11][15] = new PixelPoint(595, 495);
        centermat[11][17] = new PixelPoint(640, 495);
        centermat[11][19] = new PixelPoint(690, 495);
        centermat[11][21] = new PixelPoint(735, 495);
        centermat[11][23] = new PixelPoint(785, 495);

        centermat[12][2] = new PixelPoint(285, 535);
        centermat[12][6] = new PixelPoint(380, 535);
        centermat[12][8] = new PixelPoint(425, 535);
        centermat[12][10] = new PixelPoint(475, 535);
        centermat[12][12] = new PixelPoint(520, 535);
        centermat[12][14] = new PixelPoint(570, 535);
        centermat[12][16] = new PixelPoint(620, 535);
        centermat[12][18] = new PixelPoint(665, 535);
        centermat[12][22] = new PixelPoint(760, 535);

    }

    public void changeVillagerLabelTo(JLabel label, int x, int y) {
        switch (gameMaster.getCasillas()[x][y].getTile().getAldeanosActuales()) {
            case 0:
                label.setBounds(centermat[x][y].getX() - 5, centermat[x][y].getY() - 5, centermat[x][y].getX() + 5, centermat[x][y].getY() + 5);
                break;
            case 1:
                label.setBounds(centermat[x][y].getX() - 17, centermat[x][y].getY() - 5, centermat[x][y].getX() - 7, centermat[x][y].getY() + 5);
                break;
            case 2:
                label.setBounds(centermat[x][y].getX() + 7, centermat[x][y].getY() - 5, centermat[x][y].getX() + 17, centermat[x][y].getY() + 5);
                break;

        }
    }

}
