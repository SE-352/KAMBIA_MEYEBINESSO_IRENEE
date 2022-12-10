package models;

@Entity
@Table(name ="joueur")
public class Joueur  {

    // Attributs de joueur

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    @Column(name = "nom", nullable = false, length = 40)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 40)
    private String prenom;

    @Column(name = "numero_licence", nullable = false, length = 40)
    private String numeroLicence;

    @Column(name = "nombre_point", nullable = false)
    private int nombrePoint=0;



    // constructeur

    public Joueur(String nom, String prenom, String numeroLicence, int nombrePoint) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroLicence = numeroLicence;
        this.nombrePoint = nombrePoint;
    }


    // getters et setters 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(String numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }

    // methode toString

    @Override
    public String toString() {
        return "Joueur [nom=" + nom + ", prenom=" + prenom + ", numeroLicence=" + numeroLicence + ", nombrePoint="
                + nombrePoint + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        result = prime * result + ((numeroLicence == null) ? 0 : numeroLicence.hashCode());
        result = prime * result + nombrePoint;
        return result;
    }

    // la methode equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Joueur other = (Joueur) obj;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (numeroLicence == null) {
            if (other.numeroLicence != null)
                return false;
        } else if (!numeroLicence.equals(other.numeroLicence))
            return false;
        if (nombrePoint != other.nombrePoint)
            return false;
        return true;
    }

    // methode d'ajout des points au joueur

    public void ajouterPoints (int pointAjouter){

        this.nombrePoint += pointAjouter;
    }


    // methode de comparaison 


    public int compareTo(Joueur joueur) {
		return this.nom.compareTo(joueur.getNom());
	}
	public int compare(Joueur joueur1, Joueur joueur2) {
		
		if (joueur1.getNombrePoint()<joueur2.getNombrePoint())
			return -1;
		if (joueur1.getNombrePoint()>joueur2.getNombrePoint())
			return 1;
		else
			return 0;
	}

    
}
