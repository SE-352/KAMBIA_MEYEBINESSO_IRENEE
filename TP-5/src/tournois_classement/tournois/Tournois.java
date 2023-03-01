/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournois_classement.tournois;

import java.util.List;
import tournois_classement.match.Match;
import tournois_classement.joueurs.Joueurs;
import java.util.Random;

/**
 *
 * @author kambia
 */
public class Tournois {

    public static final int NB_POINTS_VICTOIRE = 20;
    private boolean fini;
    private List<Match> lesMatchsJoues;
    private Match[] tourEnCours;
    private List<Joueurs> joueurs;


    public Tournois() {
    }
    Random joueur = new Random();
    public Tournois(List<Joueurs> joueur) {
        
        this.joueurs = joueur;
    }


   public void joueUnTour(){
       if(fini == false){
           //Match m = new Match(tourEnCours,tourEnCours,tourEnCours);
       }
       
   }

}
