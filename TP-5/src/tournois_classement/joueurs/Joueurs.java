/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournois_classement.joueurs;

import java.util.Objects;

/**
 *
 * @author kambia
 */
public class Joueurs implements Comparable<Joueurs>{

    ;
    String nom;
    String prenom;
    String num_licence;
    int nombre_points;

    public Joueurs() {
    }

    public Joueurs(String nom, String prenom, String num_licence) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_licence = num_licence;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNum_licence() {
        return num_licence;
    }

    public int getNombre_points() {
        return nombre_points;
    }

    @Override
    public String toString() {
        return "Joueurs{" + "nom=" + nom + ", prenom=" + prenom + ", num_licence=" + num_licence + ", nombre_points=" + nombre_points + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nom);
        hash = 53 * hash + Objects.hashCode(this.prenom);
        hash = 53 * hash + Objects.hashCode(this.num_licence);
        hash = 53 * hash + this.nombre_points;
        return hash;
    }

    public boolean equals(Joueurs joueur) {
        if (this == joueur) {
            return true;
        }
        if (joueur == null) {
            return false;
        }
        if (getClass() != joueur.getClass()) {
            return false;
        }
        final Joueurs other = (Joueurs) joueur;
        if (this.nombre_points != other.nombre_points) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.num_licence, other.num_licence)) {
            return false;
        }
        return true;
    }

    public int addPoints(int points) {
        return nombre_points = nombre_points += points;
    }

    @Override
    public int compareTo(Joueurs joueur) {
        if(this.nombre_points == joueur.nombre_points){
            return 0;
        }
        else if(this.nombre_points > joueur.nombre_points){
            return 1;
        }
        return -1;
    }
    
    

}
