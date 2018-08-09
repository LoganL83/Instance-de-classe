package ExosPackage;

public class Cuisine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne P1 = new Personne();

		P1.nom = "Noufal";
		P1.prenom = "Fadi";
		P1.email = "fadi@gmail.com";
		P1.tel = "0600000000";

		Personne P2 = new Personne();

		P2.nom = "Lanfumey";
		P2.prenom = "Logan";
		P2.email = "logan@gmail.com";
		P2.tel = "0611111111";

		Verre V1 = new Verre();

		V1.nomVerre = "mug";
		V1.forme = "carre";
		V1.taille = "grand";
		V1.l.nomLiq = "cafe";
		V1.l.quantite = 15;
		
		Verre V2 = new Verre();

		V2.nomVerre = "tasse";
		V2.forme = "ronde";
		V2.taille = "petite";
		V2.l.nomLiq = "the";
		V2.l.quantite = 20;
		
		System.out.println();
	}
}
