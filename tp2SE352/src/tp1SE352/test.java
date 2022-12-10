package tp1SE352;

public class test {

	public static void main(String[] args) throws Exception{
		Joueur joueur1 = new Joueur(1,"KAMBIA", "Irenee", "KAMO123", 15);
        Joueur joueur2 = new Joueur(2,"ADELAKOUN", "Germaine", "ADE456", 12);

        MethodeJDBC joueur = new MethodeJDBC();

        joueur.add(joueur1);
        joueur.add(joueur2);

        joueur.findAll();

	}

}
