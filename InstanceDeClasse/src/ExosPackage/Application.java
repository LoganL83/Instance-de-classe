package ExosPackage;

public class Application {

	public static void main(String[] args) {

		Cuisine cuisineSimplon = new Cuisine();

		cuisineSimplon.tasse = "mug";
		cuisineSimplon.nom = "LANFUMEY";
		cuisineSimplon.prénom = "LOGAN";
		String retourcafé;
		//on appelle la méthode machinecafé de l'instance "cuisineSimplon" de la classe "cuisine" et on stock son résultat
		
		retourcafé =cuisineSimplon.machineCafé("arabica", "eau", "on");
		
		System.out.println(retourcafé);
		
		Cuisine cuisinePierre = new Cuisine();
		
		cuisinePierre.tasse = "tasse Peter Pan";
		cuisinePierre.nom = "Brogard";
		cuisinePierre.prénom = "Pierre";
		
		retourcafé = cuisinePierre.machineCafé("café colombien", "cristalline", "on");
		System.out.println(retourcafé);
		
		Cuisine cuisineAthanasia = new Cuisine();
		
		cuisineAthanasia.tasse = "tasse Tinder Bell";
		cuisineAthanasia.nom = "Katsouraki";
		cuisineAthanasia.prénom = "Athanasia";
		
		retourcafé = cuisineAthanasia.machineCafé("café arabica", "volvic", "on");
		System.out.println(retourcafé);
	}

}
