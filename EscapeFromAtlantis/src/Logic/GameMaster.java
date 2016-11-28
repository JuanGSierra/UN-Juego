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
    private VillagerCenters villagerCenters;

    private static final int MAX_PLAYERS = 4;
    private static final int MIN_PLAYERS = 2;

    private int actualTurn; // id del turno del jugador actual
    private int indexOfPlayer; // numero del jugador del turno actual 
    private boolean throwDice; // atributo que determina si toca tirar el dado o no
    private boolean volcano;
    private int posicionVillagerInicial;
    private int newValue; // atributo para metodo de inicializacion de villagers
    private int stateOfTurn;
    
    private Animal resultadoDado;
    private Effect efectos;
    private SafeVillagers safevill;
   private boolean firstMovementBarcos = false;

    //Constructor GameMaster
    public GameMaster() {

        board = new Board();
        
        villagerCenters = new VillagerCenters(this);
        
        animalsDice = new AnimalsDice();

        graphicsUI = new GraphicsUI(this);

        menu = new Menu(this);

        nuevaPartida = new NuevaPartida(this);

        comprobations = new Comprobations(this);

        movement = new Movement(this);

        ventanaDados = new VentanaDados(this);
        
        efectos = new Effect(this);

        safevill = new SafeVillagers(this);

        boats = new ArrayList();

        

        stateOfTurn = 0;
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

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Comprobations getComprobations() {
        return comprobations;
    }

    public void setComprobations(Comprobations comprobations) {
        this.comprobations = comprobations;
    }

    public int getStateOfTurn() {
        return stateOfTurn;
    }

    public void setStateOfTurn(int stateOfTurn) {
        this.stateOfTurn = stateOfTurn;
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
    
    public void setResultadoDado(Animal animal){
        
    }

    public VillagerCenters getVillagerCenters() {
        return villagerCenters;
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

        return players.get(actualTurn - 1) ;
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
        safevill.totalScore();
        JOptionPane.showMessageDialog(graphicsUI,
                    "Se ha acabado el juego \n"+
                    "El ganador es : "+determinarNombreGanador());
        System.exit(0);
    }


    public void moveSeaSerpent() {
        //movement.moveSeaSerpent();
    }

    public void moveShark() {
        //movement.moveShark();
    }

    public void moveWhale() {
        //movement.moveWhale();
    }

    /**
     * Termina las acciones del Jugador, y pasa al siguiente, genera 3 posibles
     * movimientos de fichas y tiro de dados de los monstruos marinos
     */
    public void nextTurn() {

        switch (actualTurn) {
            case 1:
                actualTurn++;
                players.get(actualTurn - 1).setNumberOfMovements(3);
                players.get(actualTurn - 1).setHasThrowDice(false);
                
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
                actualTurn = 1;
                players.get(actualTurn - 1).setHasThrowDice(false);
                players.get(actualTurn - 1).setNumberOfMovements(3);
                throwDice = false;
                break;

        }

        stateOfTurn = 1;

    }

    public void inicioDelJuego() {

        defineTurn();
        stateOfTurn = 1;
    }

    public void setFirstPositionVillagers(JLabel jlabel) {

        movement.moverVillager(players.get(actualTurn - 1).getVillagers()[posicionVillagerInicial], this.getTileOfJLabel(jlabel));
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
        
        firstMovementBarcos = true;
        
        
    }

    public boolean isFirstMovementBarcos() {
        return firstMovementBarcos;
    }
    
    
    // HAy que modificar este metodo para que mueva los barcos 
    public void setFirstPositionShips(JLabel label) {

        movement.moverBarco1(label);
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
        if (graphicsUI.getInicioDelJuego() == (Player.getNumberOfPlayers() * 10) -1) {
            for (Player player : players) {
                player.reinitializeMovements();
            }
            JOptionPane.showMessageDialog(graphicsUI, "Que empiece el juego!");
            movement.segundoTurno();
            
            JOptionPane.showMessageDialog(graphicsUI, "Mueve tus aldeanos jugador: " + players.get(actualTurn - 1).getName());
            stateOfTurn = 1;

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

    public int getActualTurn() {
        return actualTurn;
    }

    public void setActualTurn(int actualTurn) {
        this.actualTurn = actualTurn;
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
    
    public void removeTile(JLabel label){
        Tile tiletemp = getTileOfJLabel(label);
        changeCasillaToWater(tiletemp.getX(), tiletemp.getY());
        if(!(tiletemp.getEffect().equals(""))){
            efectos.accionarEfecto(tiletemp);
        }
    }
    

    public Movement getMovimiento() {
        return movement;
    }

    public Menu getMenu() {
        return menu;
    }

    public void getMejorPuntuacion() {
        String r = safevill.readScorePlayers();
        JOptionPane.showMessageDialog(menu, r);
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

    public Tile getTileOfJLabel(JLabel jLabel) {

        Tile tile = new WaterTile(0, 1, 1, false);

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                if (casillas[i][j].getLabel() != null) {
                    if (casillas[i][j].getLabel().equals(jLabel)) {
                        tile = casillas[i][j].getTile();
                        
                    }
                }

            }
        }
        return tile;
    }

    public void actualizarNombres2() {
        graphicsUI.nombresJugadores2();
    }

    public void actualizarNombres3() {
        graphicsUI.nombresJugadores3();
    }

    public void actualizarNombres4() {
        graphicsUI.nombresJugadores4();
    }

    private String determinarNombreGanador() {
        int mayor = 0;
        Player ganador=null;
        for (Player player : players) {
            if(player.getScore()>=mayor){
                mayor=player.getScore();
                ganador = player;
            }
        }
        return ganador.getName() + "  puntaje : "+ mayor;
    }


}
