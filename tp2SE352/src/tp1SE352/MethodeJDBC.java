package tp1SE352;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MethodeJDBC {
	private Connection con = BD.getBD();
	
	public void add(Joueur joueur) throws SQLException {
        String requete = "INSERT INTO joueur (nom, prenom, numero_licence, nombre_point) VALUES (?, ?, ?, ?)";
 
        PreparedStatement statement = con.prepareStatement(requete);
        statement.setString(1, joueur.getNom());
        statement.setString(2, joueur.getPrenom());
        statement.setString(3, joueur.getNumero_licence());
        statement.setInt(4, joueur.getNombre_de_point());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Nouveau joueur ajoute!");
        }
    }
	
	public List<Joueur> findAll() throws SQLException {
        String requete = "SELECT * FROM joueur";
 
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery(requete);
        List<Joueur> listeJoueur= new ArrayList<>();
        
        
        int count = 0;
        
        while (result.next()){
        	Integer id_joueur=result.getInt(5);
            String nom = result.getString(2);
            String prenom = result.getString(3);
            String numero_licence = result.getString(4);
            Integer nombre_de_point = result.getInt(5);

            Joueur joueur=new Joueur(id_joueur,nom, prenom,numero_licence, nombre_de_point);
            listeJoueur.add(joueur);
        
            String output = "Joueur #%d: %s - %s - %s - %s\n";
            System.out.println(String.format(output, ++count, nom, prenom, numero_licence, nombre_de_point));
           
        }
        return listeJoueur;
        
    }

		
	public List<Joueur> searchByNombrePoint(int nombrePointRecherche) throws SQLException {
        String requete = "SELECT * FROM joueur WHERE nombre_point="+nombrePointRecherche;
 
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery(requete);
        List<Joueur> listeJoueurRecherche= new ArrayList<>();
        
        
        int count = 0;
        
        while (result.next()){
        	Integer id_joueur=result.getInt(5);
            String nom = result.getString(2);
            String prenom = result.getString(3);
            String numero_licence = result.getString(4);
            Integer  nombre_de_point = result.getInt(5);

            Joueur joueur=new Joueur(id_joueur,nom, prenom, numero_licence, nombre_de_point);
            listeJoueurRecherche.add(joueur);
        
            String output = "Joueur #%d: %s - %s - %s - %s\n";
            System.out.println(String.format(output, ++count, nom, prenom, numero_licence, nombre_de_point));
           
        }
        return listeJoueurRecherche;
        
    }

		
	public void edit(Joueur joueur) throws SQLException {
        String requete = "UPDATE joueur SET id_joueur=?, nom=?, prenom=?, nombre_de_point=? WHERE numero_licence=?";
 
        PreparedStatement statement = con.prepareStatement(requete);
        statement.setInt(1, joueur.getId_joueur());
        statement.setString(2, joueur.getNom());
        statement.setString(3, joueur.getPrenom());
        statement.setInt(4, joueur.getNombre_de_point());
        statement.setString(5, joueur.getNumero_licence());
        
        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Les informations du joueur ont été mis à jour!");
        }
            }
	
	public void delete(String numero_licence) throws SQLException {
        String requete = "DELETE FROM joueur WHERE numero_licence=?";
 
        PreparedStatement statement = con.prepareStatement(requete);
        statement.setString(1, numero_licence);
        
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Ce joueur ne fait plus partie de la fédération!");
        }}

}
