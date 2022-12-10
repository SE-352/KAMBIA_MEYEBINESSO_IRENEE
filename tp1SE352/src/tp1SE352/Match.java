package tp1SE352;

public class Match {
private Joueur joueur1;
	

	private Joueur joueur2;
	

	private Joueur vainqueur;
	
	
	private Joueur vaincu;
	
	public Match(Joueur joueur1, Joueur joueur2) {
		super();
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
	}

	

	public Joueur getJoueur1() {
		return joueur1;
	}



	public Joueur getJoueur2() {
		return joueur2;
	}
public Joueur setVainqueur(Joueur joueur1 , Joueur joueur2) throws java.lang.IllegalArgumentException {
		
		if (joueur1.getNombre_de_point() >joueur2.getNombre_de_point()) {
			return joueur1;
		}
		else if(joueur1.getNombre_de_point() < joueur2.getNombre_de_point()) {
			return joueur2;
		}
		else {
			return null;
		}
		
	}



	public Joueur getVainqueur  ()throws java.lang.IllegalStateException {
		
			return vainqueur;
		
		
	}
	
	public Joueur getVaincu() throws java.lang.IllegalStateException{
		
		return vaincu;
		
		
	}


}
