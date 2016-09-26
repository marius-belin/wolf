/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werewolf;
import metier.*;
import java.util.*;
import utilitaires.Clavier;

/**
 *
 * @author mbeli
 */
public class Werewolf {

    /**
     * @param args the command line arguments
     */
    
    public static List<Carte> initialisePartie(List<Joueur> lesJoueurs)
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
    
    public static List<Joueur> initialiseJoueurs(int nbJoueurs)
    {
        String nom;
        List<Joueur> lesJoueurs = new ArrayList<Joueur>();
        for (int i = 0 ; i < nbJoueurs ; i++)
        {
            nom = Clavier.saisie_string("Nom du Joueur " + i);
            lesJoueurs.add(new Joueur(nom));
        }
        return lesJoueurs;
    }
    
    public static void main(String[] args) {
        int nbJoueurs = 0;
        List<Joueur> lesJoueurs;
        List<Carte> lesCartes;
        
        nbJoueurs = Clavier.saisie_int("Saisir le nombre de joueurs");
        //on demande le nombre de joueurs et on l'envoie a la fonction qui créer la collection
        lesJoueurs = initialiseJoueurs(nbJoueurs);
        // on initialise la partie, cela attribuera les cartes
        lesCartes = initialisePartie(lesJoueurs);
    }
    
}
