/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import metier.*;

/**
 *
 * @author mbeli
 */
public class Joueur {
    
    private String Nom;
    private boolean mort;
    private Carte maCarte;
    
    public Joueur(String Nom, Carte maCarte)
    {
        this.Nom = Nom;
        this.maCarte = maCarte;
        this.mort = false;
    }
    
}
