/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author johans
 */
public class GameMaster implements Serializable {

    // Atributos
    private GraphicsUI consola;
    private Board mapa;
    private MapManager mapManager;
    private ArrayList<Player> players;
    private Movement movement;
    private Comprobations comprobations;
    private Casilla casillas[][];

    private static final int MAX_PLAYERS = 4;
    private static final int MIN_PLAYERS = 2;

    private int actualTurn; // id del turno del jugador actual
    private int indexOfPlayer; // numero del jugador del turno actual 
    private boolean throwDice; // atributo que determina si toca tirar el dado o no
    private boolean volcano;
    private int posicionVillagerInicial;
    private int newValue; // atributo para metodo de inicializacion de villagers

    //Constructor GameMaster
    public GameMaster(GraphicsUI consola) {

        actualTurn = 1;
        throwDice = false;
        volcano = false;
        players = new ArrayList<>();
        mapa = new Board();
        posicionVillagerInicial = 0;
        newValue = 1;

        this.consola = consola;//
        mapManager = new MapManager(consola);
        casillas = new Casilla[13][25];
        llenarcasillas();
        comprobations = new Comprobations(this);
        movement = new Movement(this);

    }
    
    public void addPlayer(Player a){
        players.add(a);
    }

    public Player returnPlayerInTurn() {

        return players.get(actualTurn);
    }

    public void initializePlayer(String name, ArrayList<JLabel> jlabel) {
        players.add(new Player(name, jlabel));
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Define que jugador continúa el juego
     */
    public void play() {

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == actualTurn) {
                indexOfPlayer = i;
                consola.setTurnoActual("(" + players.get(i).getId() + ")."
                        + players.get(i).getName());
                consola.datosDelTurno();
                break;
            }

        }

    }

    public void endGame() {

    }

    public void eliminateWhale() {

    }

    public void eliminateShark() {

    }

    public void moveSeaSerpent() {
        movement.moveSeaSerpent();
    }

    public void moveShark() {
        movement.moveShark();
    }

    public void moveWhale() {
        movement.moveWhale();
    }

    /**
     * Termina las acciones del Jugador, y pasa al siguiente, genera 3 posibles
     * movimientos de fichas y tiro de dados de los monstruos marinos
     */
    public void nextTurn() {

        switch (actualTurn) {
            case 1:
                actualTurn++;
                players.get(actualTurn).setNumberOfMovements(3);
                players.get(actualTurn).setHasThrowDice(false);
                break;
            case 2:
                if (Player.getNumberOfPlayers() == 2) {
                    actualTurn = 1;
                } else {
                    actualTurn++;

                }
                players.get(actualTurn).setHasThrowDice(false);
                players.get(actualTurn).setNumberOfMovements(3);
                break;
            case 3:
                if (Player.getNumberOfPlayers() == 3) {
                    actualTurn = 1;
                } else {
                    actualTurn++;
                }
                players.get(actualTurn).setHasThrowDice(false);
                players.get(actualTurn).setNumberOfMovements(3);
                break;
            case 4:
                players.get(actualTurn).setHasThrowDice(false);
                players.get(actualTurn).setNumberOfMovements(3);
                throwDice = false;
                break;

        }

    }

    public void inicioDelJuego() {
        play();
    }

    public void setFirstPositionVillagers(JLabel jLabel) {

        switch (Player.getNumberOfPlayers()) {
            case 2:
                if (newValue == 1) {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    newValue++;
                    nextTurn();
                } else {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
            case 3:
                if (newValue < 3) {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    newValue++;
                    nextTurn();
                } else {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
            case 4:
                if (newValue < 4) {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    newValue++;
                    nextTurn();
                } else {
                    players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                            getJlabel().setBounds(jLabel.getBounds());
                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
        }

        if (consola.getInicioDelJuego() >= (getPlayers().size() * 10)) {

            JOptionPane.showMessageDialog(consola, "Que empiece el juego!");

        }
    }

    private void llenarcasillas() {
        JLabel labelmat[][] = consola.getLabels();
        Tile tilemat[][] = mapa.getBoard();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                casillas[i][j] = new Casilla(labelmat[i][j], tilemat[i][j]);
            }
        }
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public void setcasilla(int i, int j, JLabel label, Tile tile) {
        casillas[i][j] = new Casilla(label, tile);
    }

    public JLabel getLabelCasilla(int i, int j) {
        return casillas[i][j].getLabel();
    }

    public Tile getTileCasilla(int i, int j) {
        return casillas[i][j].getTile();
    }

    public void changeCasillaToWater(int i, int j) {
        JLabel labeltemp = casillas[i][j].getLabel();
        Tile tiletemp = casillas[i][j].getTile();
        labeltemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water Tile.png")));
        casillas[i][j].setLabel(labeltemp);
        casillas[i][j].setTile(new WaterTile(tiletemp.getPosition(), i, j, true));
    }

}
