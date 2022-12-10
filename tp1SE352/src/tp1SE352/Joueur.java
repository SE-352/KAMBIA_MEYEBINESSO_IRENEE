package tp1SE352;

public class Joueur {
	private Integer id_joueur;
	private String nom;
	private String prenom;
	private String numero_licence;
	private Integer nombre_de_point=0;
	public Joueur(Integer id_joueur, String nom, String prenom, String numero_licence, Integer nombre_de_point) {
		super();
		this.id_joueur = id_joueur;
		this.nom = nom;
		this.prenom = prenom;
		this.numero_licence = numero_licence;
		this.nombre_de_point = nombre_de_point;
	}
	public Integer getId_joueur() {
		return id_joueur;
	}
	public void setId_joueur(Integer id_joueur) {
		this.id_joueur = id_joueur;
	}
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
	public String getNumero_licence() {
		return numero_licence;
	}
	public void setNumero_licence(String numero_licence) {
		this.numero_licence = numero_licence;
	}
	public Integer getNombre_de_point() {
		return nombre_de_point;
	}
	public void setNombre_de_point(Integer nombre_de_point) {
		this.nombre_de_point = nombre_de_point;
	}
	@Override
	public String toString() {
		return "Joueur [id_joueur=" + id_joueur + ", nom=" + nom + ", prenom=" + prenom + ", numero_licence="
				+ numero_licence + ", nombre_de_point=" + nombre_de_point + "]";
	}
	public void ajouterPoint(Integer nombre_de_point) {
        this.nombre_de_point+=nombre_de_point;
    }
	public int compareTo(Object o) {
        Joueur joueur=(Joueur)o;
        if (this.nombre_de_point<=joueur.getNombre_de_point()) {
            return -1;
        }else if(this.nombre_de_point>=joueur.getNombre_de_point()) {
            return 1;
        }
        return 0;
    }
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
        if (numero_licence == null) {
            if (other.numero_licence != null)
                return false;
        } else if (!numero_licence.equals(other.numero_licence))
            return false;
        if (nombre_de_point != other.nombre_de_point)
            return false;
        return true;
    }
}
