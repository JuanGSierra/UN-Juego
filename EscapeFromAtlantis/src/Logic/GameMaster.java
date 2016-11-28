/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author johans
 */
public class GameMaster implements Serializable {

    // Atributos
    private GraphicsUI graphicsUI;
    private ArrayList<Player> players;
    private Casilla casillas[][]; // Mapa
    private Board board;

    private Movement movement;
    private Comprobations comprobations;

    private Menu menu;
    private NuevaPartida nuevaPartida;
    private VentanaDados ventanaDados;

    private AnimalsDice animalsDice;
    private ArrayList<Boat> boats;

    private static final int MAX_PLAYERS = 4;
    private static final int MIN_PLAYERS = 2;

    private int actualTurn; // id del turno del jugador actual
    private int indexOfPlayer; // numero del jugador del turno actual 
    private boolean throwDice; // atributo que determina si toca tirar el dado o no
    private boolean volcano;
    private int posicionVillagerInicial;
    private int newValue; // atributo para metodo de inicializacion de villagers

    //Constructor GameMaster
    public GameMaster() {

        animalsDice = new AnimalsDice();

        graphicsUI = new GraphicsUI(this);

        menu = new Menu(this);

        nuevaPartida = new NuevaPartida(this);

        comprobations = new Comprobations(this);

        movement = new Movement(this);

        ventanaDados = new VentanaDados(this);

        board = new Board();

        boats = new ArrayList();

        actualTurn = 1;
        throwDice = false;
        volcano = false;
        players = new ArrayList<>();

        posicionVillagerInicial = 0;
        newValue = 1;

        casillas = new Casilla[13][25];
        llenarCasillas();
        agregarBarcos();

    }

    public void agregarBarcos() {

        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(0)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(1)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(2)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(3)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(4)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(5)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(6)));
        boats.add(new Boat(graphicsUI.getArrayOfBoats().get(7)));

    }

    public AnimalsDice getAnimalsDice() {
        return animalsDice;
    }

    public VentanaDados getVentanaDados() {
        return ventanaDados;
    }

    /**
     *
     */
    public void run() {
        menu.setVisible(true);
    }

    public void addPlayer(Player a) {
        players.add(a);
    }

    public NuevaPartida getNuevaPartida() {
        return nuevaPartida;
    }

    public GraphicsUI getGraphicsUI() {
        return graphicsUI;
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
    public void defineTurn() {

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == actualTurn) {
                indexOfPlayer = i;
                graphicsUI.setTurnoActual("(" + players.get(i).getId() + ")."
                        + players.get(i).getName());

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

                players.get(actualTurn - 1).setNumberOfMovements(3);
                players.get(actualTurn - 1).setHasThrowDice(false);
                actualTurn++;
                break;
            case 2:
                if (Player.getNumberOfPlayers() == 2) {

                    actualTurn = 1;
                } else {

                    actualTurn++;

                }
                players.get(actualTurn - 1).setHasThrowDice(false);
                players.get(actualTurn - 1).setNumberOfMovements(3);
                break;
            case 3:
                if (Player.getNumberOfPlayers() == 3) {
                    actualTurn = 1;
                } else {
                    actualTurn++;
                }
                players.get(actualTurn - 1).setHasThrowDice(false);
                players.get(actualTurn - 1).setNumberOfMovements(3);
                break;
            case 4:
                players.get(actualTurn - 1).setHasThrowDice(false);
                players.get(actualTurn - 1).setNumberOfMovements(3);
                throwDice = false;
                break;

        }

    }

    public void inicioDelJuego() {

        defineTurn();
    }

    public void setFirstPositionVillagers(JLabel jlabel) {

        players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial].
                getJlabel().setBounds(jlabel.getBounds());

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 25; j++) {
                if (casillas[i][j].getLabel() != null) {
                    if (casillas[i][j].getLabel().equals(players.get(actualTurn - 1).
                            getVillagers()[posicionVillagerInicial].getJlabel())) {
                        casillas[i][j].getTile().agregarVillager(players.get(actualTurn - 1).
                                getVillagers()[posicionVillagerInicial]);
                    }

                }

            }
        }

        switch (Player.getNumberOfPlayers()) {
            case 2:
                if (newValue == 1) {

                    newValue++;
                    nextTurn();
                } else {

                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
            case 3:
                if (newValue < 3) {

                    newValue++;
                    nextTurn();
                } else {

                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
            case 4:
                if (newValue < 4) {

                    newValue++;
                    nextTurn();
                } else {

                    posicionVillagerInicial++;
                    newValue = 1;
                    nextTurn();
                }
                break;
        }

        if (graphicsUI.getInicioDelJuego() >= (getPlayers().size() * 10)) {

            JOptionPane.showMessageDialog(graphicsUI, "Que empiece el juego!");
            JOptionPane.showMessageDialog(graphicsUI, "Mueve tus aldeanos " + players.get(actualTurn).getName());

        }
    }

    private void llenarCasillas() {
        JLabel labelmat[][] = graphicsUI.getLabels();
        Tile tilemat[][] = board.getBoard();

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

    public Movement getMovimiento() {
        return movement;
    }

    public Menu getMenu() {
        return menu;
    }

    public void getMejorPuntuacion() {
        // jajajajajajaj ivan
        // que salga en un JOption Pane las mejores puntuaciones dependiendo de la puntuacion de los jugadores
    }

    public Villager getVillagerOfJLabel(JLabel jLabel) {

        Villager villager = new Villager(0, 0, jLabel);

        for (Player player : players) {
            for (int i = 0; i < 10; i++) {
                if (player.getVillagers()[i].getJlabel().equals(jLabel)) {
                    villager = player.getVillagers()[i];
                }
            }

        }
        return villager;

    }

    public void infiniteLoop() {

        while (true) {

            if (players.get(actualTurn).getNumberOfMovements() == 0 && players.get(actualTurn).isHasThrowDice()) {

            }
        }

        endGame();
    }

}
