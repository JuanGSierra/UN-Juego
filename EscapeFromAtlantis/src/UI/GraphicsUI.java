/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Data.Villager;
import Data.Animal;
import Data.Boat;
import Data.ForestTile;
import Data.Player;
import Data.Tile;
import Logic.GameMaster;
import Logic.Movement;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author johans
 */
public class GraphicsUI extends javax.swing.JFrame implements ActionListener {

    private JLabel labels[][] = new JLabel[13][25];
    private GameMaster gameMaster;
    private int inicioDelJuego;

    // atributo que me dira si tengo que quitar tiles o no
    private boolean changeTile;

    // atributo que me guarda el JLabel del Villager que quiero mover
    private JLabel positionOfVillager;

    // Nombre del jugador que esta jugando actualmente
    private String turnoActual;

    // Accion que esta haciendo el jugador
    // 1 - Mover Villagers
    // 2 - Tirar Dados
    // 3 - Levantar la Tile
    /**
     * Creates new form GraphicsUI
     */
    public GraphicsUI(GameMaster gameMaster) {

        initComponents();
        initComponentsForest();
        initComponentsMountain();
        initComponentsSand();

        asociarLabelsEnMatriz();
        //colocarNombreJugadores();

        this.gameMaster = gameMaster;
        turnoActual = "";
        inicioDelJuego = 0;
        changeTile = false;

    }

    public JLabel[][] getLabels() {
        return labels;
    }

    /**
     * Pone los datos del jugador del turno actual
     */
    public String getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(String turnoActual) {
        this.turnoActual = turnoActual;
        jLabel221.setText(turnoActual);
    }

    public GameMaster getGameMaster() {
        return gameMaster;
    }

    public void menu() {

    }

    public void printString(String something) {
        System.out.println(something);
    }

    // mal
    public void moveTo(JLabel jLabel, Villager v, Tile t) {

        if (positionOfVillager != null) {

            gameMaster.getMovimiento().moverVillager(jLabel, positionOfVillager, v, t);

        } else {
            JOptionPane.showMessageDialog(this, "Escoge un Aldeano que mover "
                    + "primero!");
        }
    }

    //Metodos de seleccion de elementos del tablero
    public void selectAnimal() {

    }

    public void selectTile() {

    }

    public void selectBoat() {

    }

    public int getInicioDelJuego() {
        return inicioDelJuego;
    }

    /**
     * Agregación de MouseListener a Tiles de Montaña
     */
    private void initComponentsMountain() {

        jLabel169.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick169(me);
            }
        });

        jLabel7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick7(me);
            }
        });

        jLabel170.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick170(me);
            }
        });

        jLabel171.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick171(me);
            }
        });

        jLabel168.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick168(me);
            }
        });

        jLabel163.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick163(me);
            }
        });

        jLabel172.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick172(me);
            }
        });

        jLabel173.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick173(me);
            }
        });

        jLabel162.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick162(me);
            }
        });

        jLabel164.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick164(me);
            }
        });

        jLabel160.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick160(me);
            }
        });

        jLabel161.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick161(me);
            }
        });

        jLabel167.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick167(me);
            }
        });

        jLabel117.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick117(me);
            }
        });

        jLabel165.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick165(me);
            }
        });

        jLabel166.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick166(me);
            }
        });

    }

    /**
     * Agregación de MouseListener a Tiles de Bosque
     */
    private void initComponentsForest() {
        jLabel41.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick41(me);
            }
        });

        jLabel38.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick38(me);
            }
        });

        jLabel17.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick17(me);
            }
        });

        jLabel24.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick24(me);
            }
        });

        jLabel36.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick36(me);
            }
        });

        jLabel40.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick40(me);
            }
        });

        jLabel35.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick35(me);
            }
        });

        jLabel39.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick39(me);
            }
        });

        jLabel33.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick33(me);
            }
        });

        jLabel26.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick26(me);
            }
        });

        jLabel32.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick32(me);
            }
        });

        jLabel27.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick27(me);
            }
        });

        jLabel31.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick31(me);
            }
        });

        jLabel30.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick30(me);
            }
        });

        jLabel29.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick29(me);
            }
        });

        jLabel28.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick28(me);
            }
        });

    }

    /**
     * Agregación de MouseListener a Tiles de Arena
     */
    private void initComponentsSand() {

        jLabel34.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick34(me);
            }
        });

        jLabel79.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick79(me);
            }
        });

        jLabel85.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick85(me);
            }
        });

        jLabel80.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick80(me);
            }
        });

        jLabel86.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick86(me);
            }
        });

        jLabel81.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick81(me);
            }
        });

        jLabel78.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick78(me);
            }
        });

        jLabel16.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick16(me);
            }
        });

        jLabel23.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick23(me);
            }
        });

        jLabel84.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick84(me);
            }
        });

        jLabel88.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick88(me);
            }
        });

        jLabel82.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick82(me);
            }
        });

        jLabel89.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick89(me);
            }
        });

        jLabel83.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick83(me);
            }
        });

        jLabel25.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick25(me);
            }
        });

        jLabel87.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick87(me);
            }
        });

    }

    // Metodos de Tiles de Montaña
    private void mouseClick169(MouseEvent me) {
        if (changeTile) {
            jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {

            gameMaster.setFirstPositionVillagers(jLabel169);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel169);
        }

    }

    private void mouseClick7(MouseEvent me) {
        if (changeTile) {
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;

        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel7);
            inicioDelJuego++;

        } else if (gameMaster.getStateOfTurn() == 1) { // falta condicion de movimiento
            moveTo(jLabel7);
        } else if (gameMaster.getStateOfTurn() == 3) {
            // levantara un tile y se acabara el turno
        }
    }

    private void mouseClick170(MouseEvent me) {
        if (changeTile) {
            jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            inicioDelJuego++;
            gameMaster.setFirstPositionVillagers(jLabel170);

        } else { // falta condicion de movimiento
            moveTo(jLabel170);
        }
    }

    private void mouseClick171(MouseEvent me) {
        if (changeTile) {
            jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel171);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel171);
        }
    }

    private void mouseClick168(MouseEvent me) {
        if (changeTile) {
            jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel168);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel168);
        }
    }

    private void mouseClick163(MouseEvent me) {
        if (changeTile) {
            jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel163);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel163);
        }
    }

    private void mouseClick172(MouseEvent me) {
        if (changeTile) {
            jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel172);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel172);
        }
    }

    private void mouseClick173(MouseEvent me) {
        if (changeTile) {
            jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel173);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel173);
        }
    }

    private void mouseClick162(MouseEvent me) {
        if (changeTile) {
            jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel162);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel162);
        }
    }

    private void mouseClick164(MouseEvent me) {
        if (changeTile) {
            jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel164);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel164);
        }
    }

    private void mouseClick160(MouseEvent me) {
        if (changeTile) {
            jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel160);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel160);
        }
    }

    private void mouseClick161(MouseEvent me) {
        if (changeTile) {
            jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel161);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel161);
        }
    }

    private void mouseClick167(MouseEvent me) {
        if (changeTile) {
            jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel167);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel167);
        }
    }

    private void mouseClick117(MouseEvent me) {
        if (changeTile) {
            jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel117);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel117);
        }
    }

    private void mouseClick165(MouseEvent me) {
        if (changeTile) {
            jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel165);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel165);
        }
    }

    private void mouseClick166(MouseEvent me) {
        if (changeTile) {
            jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel166);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel166);
        }
    }

    // Metodos Tiles de bosque
    private void mouseClick41(MouseEvent me) {
        if (changeTile) {
            jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel41);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel41);
        }
    }

    private void mouseClick38(MouseEvent me) {
        if (changeTile) {
            jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel38);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel38);
        }
    }

    private void mouseClick17(MouseEvent me) {
        if (changeTile) {
            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel17);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel17);
        }
    }

    private void mouseClick24(MouseEvent me) {
        if (changeTile) {
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel24);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel24);
        }
    }

    private void mouseClick36(MouseEvent me) {
        if (changeTile) {
            jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel36);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel36);
        }
    }

    private void mouseClick40(MouseEvent me) {
        if (changeTile) {
            jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel40);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel40);
        }
    }

    private void mouseClick35(MouseEvent me) {
        if (changeTile) {
            jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel35);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel35);
        }
    }

    private void mouseClick39(MouseEvent me) {
        if (changeTile) {
            jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel39);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel39);
        }
    }

    private void mouseClick33(MouseEvent me) {
        if (changeTile) {
            jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel33);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel33);
        }
    }

    private void mouseClick26(MouseEvent me) {
        if (changeTile) {
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel26);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel26);
        }
    }

    private void mouseClick32(MouseEvent me) {
        if (changeTile) {
            jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel32);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel32);
        }
    }

    private void mouseClick27(MouseEvent me) {
        if (changeTile) {
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel27);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel27);
        }
    }

    private void mouseClick31(MouseEvent me) {
        if (changeTile) {
            jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel31);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel31);
        }
    }

    private void mouseClick30(MouseEvent me) {
        if (changeTile) {
            jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel30);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel30);
        }
    }

    private void mouseClick29(MouseEvent me) {
        if (changeTile) {
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel29);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel29);
        }
    }

    private void mouseClick28(MouseEvent me) {
        if (changeTile) {
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel28);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel28);
        }
    }

    // Metodos Tiles de Arena
    private void mouseClick34(MouseEvent me) {
        if (changeTile) {
            jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel34);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel34);
        }
    }

    private void mouseClick79(MouseEvent me) {
        if (changeTile) {
            jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel79);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel79);
        }
    }

    private void mouseClick85(MouseEvent me) {
        if (changeTile) {
            jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel85);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel85);
        }
    }

    private void mouseClick80(MouseEvent me) {
        if (changeTile) {
            jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel80);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel80);
        }
    }

    private void mouseClick86(MouseEvent me) {
        if (changeTile) {
            jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel86);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel86);
        }
    }

    private void mouseClick81(MouseEvent me) {
        if (changeTile) {
            jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel81);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel81);
        }
    }

    private void mouseClick78(MouseEvent me) {
        if (changeTile) {
            jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel78);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel78);
        }
    }

    private void mouseClick16(MouseEvent me) {
        if (changeTile) {
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel16);
            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel16);
        }
    }

    private void mouseClick23(MouseEvent me) {
        if (changeTile) {
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel23);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel23);
        }
    }

    private void mouseClick84(MouseEvent me) {
        if (changeTile) {
            jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel84);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel84);
        }
    }

    private void mouseClick88(MouseEvent me) {
        if (changeTile) {
            jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel88);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel88);
        }
    }

    private void mouseClick82(MouseEvent me) {
        if (changeTile) {
            jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel82);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel82);
        }
    }

    private void mouseClick89(MouseEvent me) {
        if (changeTile) {
            jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel89);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel89);
        }
    }

    private void mouseClick83(MouseEvent me) {
        if (changeTile) {
            jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel83);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel83);
        }
    }

    private void mouseClick25(MouseEvent me) {
        if (changeTile) {
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel25);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel25);
        }
    }

    private void mouseClick87(MouseEvent me) {
        if (changeTile) {
            jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else if (inicioDelJuego < (gameMaster.getPlayers().size() * 10)) {
            gameMaster.setFirstPositionVillagers(jLabel87);

            inicioDelJuego++;

        } else { // falta condicion de movimiento
            moveTo(jLabel87);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("-"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel219.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(240, 240, 240));
        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel219.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel219.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel219MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 10, 20));

        jLabel220.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(240, 240, 240));
        jLabel220.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel220.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel220.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel220MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 10, 20));

        jLabel215.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(240, 240, 240));
        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel215.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel215.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel215MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 10, 20));

        jLabel200.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(240, 240, 240));
        jLabel200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel200.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel200MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 10, 20));

        jLabel216.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(240, 240, 240));
        jLabel216.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel216.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel216.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel216MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 10, 20));

        jLabel217.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(240, 240, 240));
        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel217.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel217.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel217MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 10, 20));

        jLabel218.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(240, 240, 240));
        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel218.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel218.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel218MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, 10, 20));

        jLabel182.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(240, 240, 240));
        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel182.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel182.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel182MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 10, 20));

        jLabel213.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(240, 240, 240));
        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel213.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel213.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel213MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 10, 20));

        jLabel214.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(240, 240, 240));
        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel214.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel214.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel214MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 10, 20));

        jLabel212.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(240, 240, 240));
        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel212.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel212.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel212MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 10, 20));

        jLabel211.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(240, 240, 240));
        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel211.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel211.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel211MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 10, 20));

        jLabel207.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(240, 240, 240));
        jLabel207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel207.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel207.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel207MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, 10, 20));

        jLabel208.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(240, 240, 240));
        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel208.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel208.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel208MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 10, 20));

        jLabel209.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(240, 240, 240));
        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel209.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel209.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel209MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 10, 20));

        jLabel210.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(240, 240, 240));
        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel210.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel210.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel210MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 10, 20));

        jLabel204.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(240, 240, 240));
        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel204.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel204MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 10, 20));

        jLabel205.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(240, 240, 240));
        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel205.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel205MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 10, 20));

        jLabel206.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(240, 240, 240));
        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel206.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel206.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel206MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 10, 20));

        jLabel203.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(240, 240, 240));
        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel203.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel203.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel203MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, 10, 20));

        jLabel202.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(240, 240, 240));
        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel202.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel202.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel202MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 10, 20));

        jLabel187.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(240, 240, 240));
        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel187.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel187.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel187MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 10, 20));

        jLabel196.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(240, 240, 240));
        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel196.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel196.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel196MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 10, 20));

        jLabel197.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(240, 240, 240));
        jLabel197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel197.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel197.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel197MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 10, 20));

        jLabel198.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(240, 240, 240));
        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel198.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel198.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel198MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 10, 20));

        jLabel199.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(240, 240, 240));
        jLabel199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel199.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel199.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel199MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 10, 20));

        jLabel195.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(240, 240, 240));
        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel195.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel195.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel195MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 10, 20));

        jLabel193.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(240, 240, 240));
        jLabel193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel193.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel193.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel193MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 10, 20));

        jLabel201.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(240, 240, 240));
        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel201.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel201.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel201MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 10, 20));

        jLabel194.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(240, 240, 240));
        jLabel194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel194.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel194.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel194MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 10, 20));

        jLabel189.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(240, 240, 240));
        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel189.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel189.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel189MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 10, 20));

        jLabel190.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(240, 240, 240));
        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel190.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel190.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel190MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 10, 20));

        jLabel191.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(240, 240, 240));
        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel191.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel191.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel191MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 20));

        jLabel192.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(240, 240, 240));
        jLabel192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel192.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel192.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel192MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));

        jLabel188.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(240, 240, 240));
        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel188.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel188.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel188MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 10, 20));

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(240, 240, 240));
        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel186.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel186.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel186MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 10, 20));

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(240, 240, 240));
        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel185.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel185.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel185MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 10, 20));

        jLabel184.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(240, 240, 240));
        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel184.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel184.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel184MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 10, 20));

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(240, 240, 240));
        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel183.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel183.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel183MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 10, 20));

        jLabel181.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(240, 240, 240));
        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel181.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel181.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel181MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 10, 20));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel150.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, -1));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel152.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 30, -1));

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel177.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 30, -1));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel149.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel178.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, -1));

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel179.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 30, -1));

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel180.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 30, -1));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel159.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 30, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 30, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 30, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 30, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 30, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 30, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 30, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 30, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 30, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 30, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 30, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 30, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 30, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 30, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel7.setText("jLabel5");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 238, 50, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 281, 50, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 155, 50, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 50, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 155, 50, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 363, 50, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 323, 50, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 364, 50, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 405, 50, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 405, 50, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 405, 50, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 406, 50, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 364, 50, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 323, 50, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 155, 50, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 240, 50, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 198, 50, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 531, 50, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 156, 50, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 239, 50, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 196, 50, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 156, 50, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 30, 50, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 71, 50, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 113, 50, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 29, 50, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 70, 50, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 112, 50, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 448, 50, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 489, 50, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 531, 50, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 489, 50, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 448, 50, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 72, 50, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 530, 50, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 50, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 530, 50, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 530, 50, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 530, 50, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 531, 50, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 237, 50, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 73, 50, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 73, 50, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 73, 50, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 72, 50, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 72, 50, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 72, 50, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 72, 50, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 71, 50, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 72, 50, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 114, 50, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 115, 50, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 114, 50, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 114, 50, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 114, 50, -1));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 114, 50, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 112, 50, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 282, 50, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 198, 50, -1));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 241, 50, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 282, 50, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 324, 50, -1));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 365, 50, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 280, 50, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 197, 50, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 238, 50, -1));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 406, 50, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 279, 50, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jLabel89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 321, 50, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 112, 50, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 112, 50, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 113, 50, -1));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 113, 50, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 157, 50, -1));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 156, 50, -1));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 156, 50, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 154, 50, -1));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 155, 50, -1));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 199, 50, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 198, 50, -1));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 196, 50, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 196, 50, -1));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 278, 50, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 241, 50, -1));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 237, 50, -1));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 241, 50, -1));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 283, 50, -1));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 320, 50, -1));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 324, 50, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 404, 50, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 320, 50, -1));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 324, 50, -1));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 366, 50, -1));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 365, 50, 50));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 530, 50, -1));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 362, 50, -1));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 361, 50, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 407, 50, -1));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 405, 50, -1));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 404, 50, -1));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 31, 50, -1));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 31, 50, -1));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 30, 50, -1));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 30, 50, -1));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 30, 50, -1));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 50, -1));

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 30, 50, -1));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 31, 50, -1));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 31, 50, -1));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 30, 50, -1));

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 30, 50, -1));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 30, 50, -1));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 50, -1));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 30, 50, -1));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 407, 50, -1));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 449, 50, -1));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 449, 50, -1));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 449, 50, -1));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 449, 50, -1));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 448, 50, -1));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 447, 50, -1));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 445, 50, -1));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 447, 50, -1));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 447, 50, -1));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 447, 50, -1));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 447, 50, -1));

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 448, 50, -1));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 490, 50, -1));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 488, 50, -1));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 489, 50, -1));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 489, 50, -1));

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 489, 50, -1));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 489, 50, -1));

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 489, 50, -1));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 280, 50, -1));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel160.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 322, 50, -1));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel161.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 321, 50, -1));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel162.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 275, 50, 60));

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel163.setText("jLabel2");
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 239, 50, -1));

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel164.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 322, 50, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel117.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 364, 50, -1));

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel165.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 364, 50, -1));

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel166.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 364, 50, -1));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel167.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 322, 50, -1));

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel168.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 239, 50, -1));

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel169.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 197, 50, -1));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel170.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 197, 50, -1));

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel171.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 196, 50, -1));

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel172.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 238, 50, -1));

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel173.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 280, 50, -1));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 50, -1));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 489, 50, -1));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 487, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo con bordes.png"))); // NOI18N
        jLabel1.setLabelFor(jPanel2);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Pasar Turno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tirar Dado Animales");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Turno Actual:");

        jLabel221.setText("...");

        jLabel222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/red villager.png"))); // NOI18N
        jLabel222.setText("equipo rojo : ");

        jLabel223.setText("...");

        jLabel224.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel224.setText("equipo azul : ");

        jLabel225.setText("...");

        jLabel226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yellow villager.png"))); // NOI18N
        jLabel226.setText("equipo amarillo : ");

        jLabel227.setText("...");

        jLabel228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/green villager.png"))); // NOI18N
        jLabel228.setText("equipo verde : ");

        jLabel229.setText("...");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Despues de ubicar los \naldeanos y los botes en\ncada turno se debe:\n1.Mover aldeanos\n2.Retirar baldoza\n3.Ejecutar efecto baldoza\n4.Lanzar dado animales\n5.Mover animal indicado");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel221, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel224)
                    .addComponent(jLabel222)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel226, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel228)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel223)
                    .addComponent(jLabel227)
                    .addComponent(jLabel225)
                    .addComponent(jLabel229))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel221))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel222)
                    .addComponent(jLabel223))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel224)
                    .addComponent(jLabel225))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel226)
                    .addComponent(jLabel227))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel228)
                    .addComponent(jLabel229))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        gameMaster.getMenu().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gameMaster.nextTurn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        gameMaster.getVentanaDados().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    // Metodos de los villagers, cuando se seleccionan positionOfVillager cambia
    // al villager seleccionado para así moverse.

    private void jLabel181MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel181MouseClicked
        positionOfVillager = jLabel181;
    }//GEN-LAST:event_jLabel181MouseClicked

    private void jLabel182MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel182MouseClicked
        positionOfVillager = jLabel182;
    }//GEN-LAST:event_jLabel182MouseClicked

    private void jLabel183MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseClicked
        positionOfVillager = jLabel183;
    }//GEN-LAST:event_jLabel183MouseClicked

    private void jLabel184MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseClicked
        positionOfVillager = jLabel184;
    }//GEN-LAST:event_jLabel184MouseClicked

    private void jLabel185MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel185MouseClicked
        positionOfVillager = jLabel185;
    }//GEN-LAST:event_jLabel185MouseClicked

    private void jLabel186MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel186MouseClicked
        positionOfVillager = jLabel186;
    }//GEN-LAST:event_jLabel186MouseClicked

    private void jLabel187MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel187MouseClicked
        positionOfVillager = jLabel187;
    }//GEN-LAST:event_jLabel187MouseClicked

    private void jLabel188MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseClicked
        positionOfVillager = jLabel188;
    }//GEN-LAST:event_jLabel188MouseClicked

    private void jLabel189MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel189MouseClicked
        positionOfVillager = jLabel189;
    }//GEN-LAST:event_jLabel189MouseClicked

    private void jLabel190MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel190MouseClicked
        positionOfVillager = jLabel190;
    }//GEN-LAST:event_jLabel190MouseClicked

    private void jLabel191MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel191MouseClicked
        positionOfVillager = jLabel191;
    }//GEN-LAST:event_jLabel191MouseClicked

    private void jLabel192MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel192MouseClicked
        positionOfVillager = jLabel192;
    }//GEN-LAST:event_jLabel192MouseClicked

    private void jLabel193MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel193MouseClicked
        positionOfVillager = jLabel193;
    }//GEN-LAST:event_jLabel193MouseClicked

    private void jLabel194MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel194MouseClicked
        positionOfVillager = jLabel194;
    }//GEN-LAST:event_jLabel194MouseClicked

    private void jLabel195MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel195MouseClicked
        positionOfVillager = jLabel195;
    }//GEN-LAST:event_jLabel195MouseClicked

    private void jLabel196MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel196MouseClicked
        positionOfVillager = jLabel196;
    }//GEN-LAST:event_jLabel196MouseClicked

    private void jLabel197MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel197MouseClicked
        positionOfVillager = jLabel197;
    }//GEN-LAST:event_jLabel197MouseClicked

    private void jLabel198MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel198MouseClicked
        positionOfVillager = jLabel198;
    }//GEN-LAST:event_jLabel198MouseClicked

    private void jLabel199MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel199MouseClicked
        positionOfVillager = jLabel199;
    }//GEN-LAST:event_jLabel199MouseClicked

    private void jLabel200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel200MouseClicked
        positionOfVillager = jLabel200;
    }//GEN-LAST:event_jLabel200MouseClicked

    private void jLabel201MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel201MouseClicked
        positionOfVillager = jLabel201;
    }//GEN-LAST:event_jLabel201MouseClicked

    private void jLabel202MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel202MouseClicked
        positionOfVillager = jLabel202;
    }//GEN-LAST:event_jLabel202MouseClicked

    private void jLabel203MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel203MouseClicked
        positionOfVillager = jLabel203;
    }//GEN-LAST:event_jLabel203MouseClicked

    private void jLabel204MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel204MouseClicked
        positionOfVillager = jLabel204;
    }//GEN-LAST:event_jLabel204MouseClicked

    private void jLabel205MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel205MouseClicked
        positionOfVillager = jLabel205;
    }//GEN-LAST:event_jLabel205MouseClicked

    private void jLabel206MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel206MouseClicked
        positionOfVillager = jLabel206;
    }//GEN-LAST:event_jLabel206MouseClicked

    private void jLabel207MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel207MouseClicked
        positionOfVillager = jLabel207;
    }//GEN-LAST:event_jLabel207MouseClicked

    private void jLabel208MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel208MouseClicked
        positionOfVillager = jLabel208;
    }//GEN-LAST:event_jLabel208MouseClicked

    private void jLabel209MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel209MouseClicked
        positionOfVillager = jLabel209;
    }//GEN-LAST:event_jLabel209MouseClicked

    private void jLabel210MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel210MouseClicked
        positionOfVillager = jLabel210;
    }//GEN-LAST:event_jLabel210MouseClicked

    private void jLabel211MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel211MouseClicked
        positionOfVillager = jLabel211;
    }//GEN-LAST:event_jLabel211MouseClicked

    private void jLabel212MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel212MouseClicked
        positionOfVillager = jLabel212;
    }//GEN-LAST:event_jLabel212MouseClicked

    private void jLabel213MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel213MouseClicked
        positionOfVillager = jLabel213;
    }//GEN-LAST:event_jLabel213MouseClicked

    private void jLabel214MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel214MouseClicked
        positionOfVillager = jLabel214;
    }//GEN-LAST:event_jLabel214MouseClicked

    private void jLabel215MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel215MouseClicked
        positionOfVillager = jLabel215;
    }//GEN-LAST:event_jLabel215MouseClicked

    private void jLabel216MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel216MouseClicked
        positionOfVillager = jLabel216;
    }//GEN-LAST:event_jLabel216MouseClicked

    private void jLabel217MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel217MouseClicked
        positionOfVillager = jLabel217;
    }//GEN-LAST:event_jLabel217MouseClicked

    private void jLabel218MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel218MouseClicked
        positionOfVillager = jLabel218;
    }//GEN-LAST:event_jLabel218MouseClicked

    private void jLabel219MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel219MouseClicked
        positionOfVillager = jLabel219;
    }//GEN-LAST:event_jLabel219MouseClicked

    private void jLabel220MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel220MouseClicked
        positionOfVillager = jLabel220;
    }//GEN-LAST:event_jLabel220MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public void endScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawWhale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawShark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawBoat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<JLabel> getArray1() {
        ArrayList<JLabel> jlabel = new ArrayList();
        jlabel.add(jLabel191);
        jlabel.add(jLabel188);
        jlabel.add(jLabel187);
        jlabel.add(jLabel181);
        jlabel.add(jLabel182);
        jlabel.add(jLabel183);
        jlabel.add(jLabel184);
        jlabel.add(jLabel185);
        jlabel.add(jLabel186);
        jlabel.add(jLabel192);

        return jlabel;
    }

    ArrayList<JLabel> getArray2() {
        ArrayList<JLabel> jlabel = new ArrayList();
        jlabel.add(jLabel193);
        jlabel.add(jLabel194);
        jlabel.add(jLabel195);
        jlabel.add(jLabel189);
        jlabel.add(jLabel190);
        jlabel.add(jLabel196);
        jlabel.add(jLabel197);
        jlabel.add(jLabel198);
        jlabel.add(jLabel199);
        jlabel.add(jLabel201);

        return jlabel;
    }

    ArrayList<JLabel> getArray3() {
        ArrayList<JLabel> jlabel = new ArrayList();
        jlabel.add(jLabel200);
        jlabel.add(jLabel202);
        jlabel.add(jLabel203);
        jlabel.add(jLabel207);
        jlabel.add(jLabel208);
        jlabel.add(jLabel206);
        jlabel.add(jLabel205);
        jlabel.add(jLabel204);
        jlabel.add(jLabel210);
        jlabel.add(jLabel209);

        return jlabel;
    }

    ArrayList<JLabel> getArray4() {
        ArrayList<JLabel> jlabel = new ArrayList();
        jlabel.add(jLabel211);
        jlabel.add(jLabel212);
        jlabel.add(jLabel217);
        jlabel.add(jLabel218);
        jlabel.add(jLabel219);
        jlabel.add(jLabel213);
        jlabel.add(jLabel214);
        jlabel.add(jLabel216);
        jlabel.add(jLabel215);
        jlabel.add(jLabel220);

        return jlabel;
    }

    public ArrayList<JLabel> getArrayOfBoats() {
        ArrayList<JLabel> array = new ArrayList();
        array.add(jLabel180);
        array.add(jLabel159);
        array.add(jLabel149);
        array.add(jLabel179);
        array.add(jLabel178);
        array.add(jLabel177);
        array.add(jLabel152);
        array.add(jLabel150);

        return array;
    }

    private void asociarLabelsEnMatriz() {
        labels[0][2] = jLabel44;// finish
        labels[1][1] = jLabel43;
        labels[2][0] = jLabel42;

        labels[0][22] = jLabel45;
        labels[1][23] = jLabel46;
        labels[2][24] = jLabel47;

        labels[10][0] = jLabel48;
        labels[11][1] = jLabel49;
        labels[12][2] = jLabel50;

        labels[10][24] = jLabel37;
        labels[11][23] = jLabel52;
        labels[12][22] = jLabel53;

        labels[4][10] = jLabel169;// mountain
        labels[4][12] = jLabel170;
        labels[4][14] = jLabel171;

        labels[5][9] = jLabel168;
        labels[5][11] = jLabel7;
        labels[5][13] = jLabel163;
        labels[5][15] = jLabel172;

        labels[6][10] = jLabel173;
        labels[6][14] = jLabel162;

        labels[7][9] = jLabel164;
        labels[7][11] = jLabel160;
        labels[7][13] = jLabel161;
        labels[7][15] = jLabel167;

        labels[8][10] = jLabel117;
        labels[8][12] = jLabel165;
        labels[8][14] = jLabel166;

        labels[3][9] = jLabel41;// bosque
        labels[3][11] = jLabel38;
        labels[3][13] = jLabel17;
        labels[3][15] = jLabel24;

        labels[4][8] = jLabel36;
        labels[4][16] = jLabel40;

        labels[5][7] = jLabel35;
        labels[5][17] = jLabel39;

        labels[7][7] = jLabel33;
        labels[7][17] = jLabel26;

        labels[8][8] = jLabel32;
        labels[8][16] = jLabel27;

        labels[9][9] = jLabel31;
        labels[9][11] = jLabel30;
        labels[9][13] = jLabel29;
        labels[9][15] = jLabel28;

        labels[3][17] = jLabel34; // arena

        labels[4][6] = jLabel79;
        labels[4][18] = jLabel85;

        labels[5][5] = jLabel80;
        labels[5][19] = jLabel86;

        labels[6][4] = jLabel81;
        labels[6][6] = jLabel78;
        labels[6][8] = jLabel16;
        labels[6][16] = jLabel23;
        labels[6][18] = jLabel84;
        labels[6][20] = jLabel88;

        labels[7][5] = jLabel82;
        labels[7][19] = jLabel89;

        labels[8][6] = jLabel83;
        labels[8][18] = jLabel25;

        labels[9][7] = jLabel87;

        labels[0][6] = jLabel121;// agua
        labels[0][8] = jLabel122;
        labels[0][10] = jLabel123;
        labels[0][12] = jLabel124;
        labels[0][14] = jLabel125;
        labels[0][16] = jLabel126;
        labels[0][18] = jLabel127;

        labels[1][3] = jLabel70;
        labels[1][5] = jLabel62;
        labels[1][7] = jLabel63;
        labels[1][9] = jLabel64;
        labels[1][11] = jLabel65;
        labels[1][13] = jLabel66;
        labels[1][15] = jLabel67;
        labels[1][17] = jLabel68;
        labels[1][19] = jLabel69;
        labels[1][21] = jLabel54;

        labels[2][2] = jLabel71;
        labels[2][4] = jLabel72;
        labels[2][6] = jLabel73;
        labels[2][8] = jLabel74;
        labels[2][10] = jLabel75;
        labels[2][12] = jLabel76;
        labels[2][14] = jLabel77;
        labels[2][16] = jLabel90;
        labels[2][18] = jLabel91;
        labels[2][20] = jLabel92;
        labels[2][22] = jLabel93;

        labels[3][3] = jLabel94;
        labels[3][5] = jLabel95;
        labels[3][7] = jLabel96;
        labels[3][19] = jLabel97;
        labels[3][21] = jLabel98;

        labels[4][2] = jLabel99;
        labels[4][4] = jLabel100;
        labels[4][20] = jLabel101;
        labels[4][22] = jLabel102;

        labels[5][1] = jLabel106;
        labels[5][3] = jLabel104;
        labels[5][21] = jLabel105;
        labels[5][23] = jLabel61;

        labels[6][2] = jLabel108;
        labels[6][12] = jLabel158;
        labels[6][22] = jLabel103;

        labels[7][1] = jLabel112;
        labels[7][3] = jLabel110;
        labels[7][21] = jLabel111;
        labels[7][23] = jLabel107;

        labels[8][2] = jLabel113;
        labels[8][4] = jLabel114;
        labels[8][20] = jLabel115;
        labels[8][22] = jLabel116;

        labels[9][3] = jLabel135;
        labels[9][5] = jLabel118;
        labels[9][17] = jLabel119;
        labels[9][19] = jLabel120;
        labels[9][21] = jLabel109;

        labels[10][2] = jLabel136;
        labels[10][4] = jLabel138;
        labels[10][6] = jLabel139;
        labels[10][8] = jLabel140;
        labels[10][10] = jLabel141;
        labels[10][12] = jLabel142;
        labels[10][14] = jLabel143;
        labels[10][16] = jLabel144;
        labels[10][18] = jLabel145;
        labels[10][20] = jLabel146;
        labels[10][22] = jLabel147;

        labels[11][3] = jLabel148;
        labels[11][5] = jLabel149;
        labels[11][7] = jLabel150;
        labels[11][9] = jLabel151;
        labels[11][11] = jLabel152;
        labels[11][13] = jLabel153;
        labels[11][15] = jLabel154;
        labels[11][17] = jLabel155;
        labels[11][19] = jLabel156;
        labels[11][21] = jLabel157;

        labels[12][6] = jLabel60;
        labels[12][8] = jLabel55;
        labels[12][10] = jLabel56;
        labels[12][12] = jLabel57;
        labels[12][14] = jLabel58;
        labels[12][16] = jLabel59;
        labels[12][18] = jLabel51;

    }

    private void colocarNombreJugadores() {
        try {
            jLabel223.setText(gameMaster.getPlayers().get(0).getName());
            jLabel225.setText(gameMaster.getPlayers().get(1).getName());
            jLabel227.setText(gameMaster.getPlayers().get(2).getName());
            jLabel229.setText(gameMaster.getPlayers().get(3).getName());
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
