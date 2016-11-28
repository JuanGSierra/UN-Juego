/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Player;
import Data.Villager;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ivan Delgado
 */
public class SafeVillagers implements Serializable {

    private final ArrayList<Villager> Villagers;
    private GameMaster gameMaster;

    public SafeVillagers(GameMaster gameMaster) {
        Villagers = new ArrayList<>();
        this.gameMaster=gameMaster;
    }

    public void addSafeVillager(Villager V) {
        Villagers.add(V);
    }

    public void totalScore() {
        
        for (Player p : gameMaster.getPlayers()) {
            for (Villager v : Villagers) {
                if (p.getId() == v.getIdPlayer()) {
                    p.setScore(p.getScore() + v.getValue());
                }
            }
        }
    }
    
    public String readScorePlayers (){
        String a="";
        for (Player p : gameMaster.getPlayers()) {
            a=a+p.getName()+" "+p.getScore()+"\n";
        }
        return a;
    }
}
