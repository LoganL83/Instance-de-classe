package Postit;

public class surface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Postit papier = new Postit();
		Pen ecriture = new Pen();
		
		papier.couleur = "jaune ";
		papier.forme = "carré(e) ";
		papier.taillecm = 7;
		papier.iscollant = true;
		papier.cont.pencil.genrePen = " feutre";
		System.out.println("Le post-it est " + papier.couleur + "de forme " + papier.forme + "il mesure " + 
		papier.taillecm + " j'ai écris dessus avec un " + papier.cont.pencil.genrePen);
		System.out.println();
	}

}
