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
public class SafeVillagers implements Serializable{
  
   private ArrayList<Villager> Villagers;

    public SafeVillagers() {
        Villagers = new ArrayList<>();
    }
   
    public void addSafeVillager(Villager V){
        Villagers.add(V);
    }
    
    public void total (ArrayList<Player> players, ArrayList<Villager> villagers){
        for(Player p : players){
            for(Villager v : villagers){
                if (p.getId()== v.getIdPlayer()){
                    p.setScore(p.getScore()+v.getValue());
                }
            }
        }  
    }
   
    
}
