/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Animal;
import Data.Boat;
import Data.Player;
import Data.Tile;
import Logic.GameMaster;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author johans
 */
public class GraphicsUI extends javax.swing.JFrame implements ActionListener {

    String separador = System.getProperty("file.separator");
    private GameMaster gameMaster;
    private Menu menu;

    // atributo que me dira si tengo que quitar tiles o no
    private boolean changeTile;

    // atributo que me guarda el JLabel del Villager que quiero mover
    private JLabel positionOfVillager;

    /**
     * Creates new form GraphicsUI
     */
    public GraphicsUI() {
        initComponents();
        initComponentsForest();
        initComponentsMountain();
        initComponentsSand();
        //initComponentsVillagers();

        this.gameMaster = new GameMaster(this);
        menu = new Menu(this);

        menu.setVisible(true);
        this.setVisible(false);
        changeTile = false;

    }

    public GameMaster getGameMaster() {
        return gameMaster;
    }

    public void initializePlayer() {
        gameMaster.initializePlayer("");
    }

    public void menu() {

    }

    public void printString(String something) {
        System.out.println(something);
    }

    public void moveTo(JLabel jLabel) {

        if (positionOfVillager != null) {
            positionOfVillager.setBounds(jLabel.getBounds());
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
        } else {

        }

    }

    private void mouseClick7(MouseEvent me) {
        if (changeTile) {
            jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;

        } else {
            moveTo(jLabel7);

        }
    }

    private void mouseClick170(MouseEvent me) {
        if (changeTile) {
            jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick171(MouseEvent me) {
        if (changeTile) {
            jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick168(MouseEvent me) {
        if (changeTile) {
            jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick163(MouseEvent me) {
        if (changeTile) {
            jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick172(MouseEvent me) {
        if (changeTile) {
            jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick173(MouseEvent me) {
        if (changeTile) {
            jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick162(MouseEvent me) {
        if (changeTile) {
            jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick164(MouseEvent me) {
        if (changeTile) {
            jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick160(MouseEvent me) {
        if (changeTile) {
            jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick161(MouseEvent me) {
        if (changeTile) {
            jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick167(MouseEvent me) {
        if (changeTile) {
            jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick117(MouseEvent me) {
        if (changeTile) {
            jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick165(MouseEvent me) {
        if (changeTile) {
            jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick166(MouseEvent me) {
        if (changeTile) {
            jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    // Metodos Tiles de bosque
    private void mouseClick41(MouseEvent me) {
        if (changeTile) {
            jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick38(MouseEvent me) {
        if (changeTile) {
            jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick17(MouseEvent me) {
        if (changeTile) {
            jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick24(MouseEvent me) {
        if (changeTile) {
            jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick36(MouseEvent me) {
        if (changeTile) {
            jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick40(MouseEvent me) {
        if (changeTile) {
            jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick35(MouseEvent me) {
        if (changeTile) {
            jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick39(MouseEvent me) {
        if (changeTile) {
            jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick33(MouseEvent me) {
        if (changeTile) {
            jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick26(MouseEvent me) {
        if (changeTile) {
            jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick32(MouseEvent me) {
        if (changeTile) {
            jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick27(MouseEvent me) {
        if (changeTile) {
            jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick31(MouseEvent me) {
        if (changeTile) {
            jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick30(MouseEvent me) {
        if (changeTile) {
            jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick29(MouseEvent me) {
        if (changeTile) {
            jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick28(MouseEvent me) {
        if (changeTile) {
            jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    // Metodos Tiles de Arena
    private void mouseClick34(MouseEvent me) {
        if (changeTile) {
            jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick79(MouseEvent me) {
        if (changeTile) {
            jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick85(MouseEvent me) {
        if (changeTile) {
            jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick80(MouseEvent me) {
        if (changeTile) {
            jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick86(MouseEvent me) {
        if (changeTile) {
            jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick81(MouseEvent me) {
        if (changeTile) {
            jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick78(MouseEvent me) {
        if (changeTile) {
            jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick16(MouseEvent me) {
        if (changeTile) {
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick23(MouseEvent me) {
        if (changeTile) {
            jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick84(MouseEvent me) {
        if (changeTile) {
            jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick88(MouseEvent me) {
        if (changeTile) {
            jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick82(MouseEvent me) {
        if (changeTile) {
            jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick89(MouseEvent me) {
        if (changeTile) {
            jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick83(MouseEvent me) {
        if (changeTile) {
            jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick25(MouseEvent me) {
        if (changeTile) {
            jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    private void mouseClick87(MouseEvent me) {
        if (changeTile) {
            jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png")));
            changeTile = false;
        } else {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
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
        jLabel51 = new javax.swing.JLabel();
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
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("-"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel181.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(240, 240, 240));
        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue villager.png"))); // NOI18N
        jLabel181.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel181.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel181MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 10, 20));

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

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel159.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 30, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 30, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 30, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 30, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 30, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Whale.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 30, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 30, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 30, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 30, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 30, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 30, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 30, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 30, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shark.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 30, 20));

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

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 530, 50, -1));

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
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 365, 50, -1));

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

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel178.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, -1));

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel179.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 30, -1));

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ship.png"))); // NOI18N
        jLabel180.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 30, -1));

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
                .addContainerGap(29, Short.MAX_VALUE))
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
                .addContainerGap(40, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1601, 1601, 1601))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gameMaster.nextTurn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel181MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel181MouseClicked
        positionOfVillager = jLabel181;
    }//GEN-LAST:event_jLabel181MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        GraphicsUI x = new GraphicsUI();

    }


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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JSeparator jSeparator2;
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
}
