/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werewolf;
import metier.*;
import java.util.*;

/**
 *
 * @author mbeli
 */
public class Werewolf {

    /**
     * @param args the command line arguments
     */
    
    public static List<Carte> initialisePartie()
    {
        // Création des cartes de la partie
        List<Carte> Cartes = new ArrayList<Carte>();
        
        // Création de chaque carte et ajout dans la collection
        Cartes.add(new Cupidon("Cupidon"));
        Cartes.add(new LoupGarou("Loup-Garou"));
        Cartes.add(new LoupGarou("Loup-Garou"));
        Cartes.add(new Sorciere("Sorciere"));
        Cartes.add(new Villageois("Villageois"));
        Cartes.add(new Voyante("Voyante"));
        return Cartes;
    }
    
    public static void main(String[] args) {
        //test
    }
    
}
