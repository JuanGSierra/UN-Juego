/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
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
    
   
    
}
