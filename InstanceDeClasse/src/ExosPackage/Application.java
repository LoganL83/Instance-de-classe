package ExosPackage;

public class Application {

	public static void main(String[] args) {

		Cuisine cuisineSimplon = new Cuisine();

		cuisineSimplon.tasse = "mug";
		cuisineSimplon.nom = "LANFUMEY";
		cuisineSimplon.pr�nom = "LOGAN";
		String retourcaf�;
		//on appelle la m�thode machinecaf� de l'instance "cuisineSimplon" de la classe "cuisine" et on stock son r�sultat
		
		retourcaf� =cuisineSimplon.machineCaf�("arabica", "eau", "on");
		
		System.out.println(retourcaf�);
		
		Cuisine cuisinePierre = new Cuisine();
		
		cuisinePierre.tasse = "tasse Peter Pan";
		cuisinePierre.nom = "Brogard";
		cuisinePierre.pr�nom = "Pierre";
		
		retourcaf� = cuisinePierre.machineCaf�("caf� colombien", "cristalline", "on");
		System.out.println(retourcaf�);
		
		Cuisine cuisineAthanasia = new Cuisine();
		
		cuisineAthanasia.tasse = "tasse Tinder Bell";
		cuisineAthanasia.nom = "Katsouraki";
		cuisineAthanasia.pr�nom = "Athanasia";
		
		retourcaf� = cuisineAthanasia.machineCaf�("caf� arabica", "volvic", "on");
		System.out.println(retourcaf�);
	}

}
