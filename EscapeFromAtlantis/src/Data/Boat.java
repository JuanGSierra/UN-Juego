/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author macas
 */
public class Boat implements Serializable {

    private final int MAXPLAYERQUANTITY = 3;
    private int quantity;
    private boolean full;
    private String mayorTeam;
    private JLabel jLabel;

    public Boat(JLabel jLabel) {
        this.jLabel = jLabel;
        quantity = 0;
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFull() {
        if (this.quantity == this.MAXPLAYERQUANTITY) {
            return true;
        } else {
            return false;
        }
    }

    public String getMayorTeam() {
        return mayorTeam;
    }

    public void setMayorTeam(String mayorTeam) {
        this.mayorTeam = mayorTeam;
    }
}
