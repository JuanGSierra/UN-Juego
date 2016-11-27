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
    private MapManager mapManager;
    private ArrayList<Player> players;
    private Movement movement;

    private static final int MAX_PLAYERS = 4;
    private static final int MIN_PLAYERS = 2;

    private int numberOfMovements; // numero de movimientos del jugador actual
    private int actualTurn; // id del turno del jugador actual
    private int indexOfPlayer; // numero del jugador del turno actual 
    private boolean throwDice; // atributo que determina si toca tirar el dado o no
    private boolean volcano;
    private int posicionVillagerInicial;
    private int newValue; // atributo para metodo de inicializacion de villagers

    //Constructor GameMaster
    public GameMaster(GraphicsUI consola) {

        numberOfMovements = 3;
        actualTurn = 1;
        throwDice = false;
        volcano = false;
        players = new ArrayList<>();
        posicionVillagerInicial = 0;
        newValue = 1;

        this.consola = consola;//
        mapManager = new MapManager(consola);

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
                numberOfMovements = 3;
                throwDice = false;
                break;
            case 2:
                if (Player.getNumberOfPlayers() == 2) {
                    actualTurn = 1;
                } else {
                    actualTurn++;

                }
                throwDice = false;
                numberOfMovements = 3;
                break;
            case 3:
                if (Player.getNumberOfPlayers() == 3) {
                    actualTurn = 1;
                } else {
                    actualTurn++;
                }
                throwDice = false;
                numberOfMovements = 3;
                break;
            case 4:
                actualTurn = 1;
                numberOfMovements = 3;
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

}
