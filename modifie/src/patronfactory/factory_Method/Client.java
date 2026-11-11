package patronfactory.factory_Method;

public class Client {
      
	public static void main(String[] args) {
		FabriqueProduit fabriqueProduit = new FabriqueProduit();
		Produit produit = null;		
		
		// Afficher un produit de type A
		produit = fabriqueProduit.createProduit(fabriqueProduit.typeA);
		produit.methodeproduit();
		// Afficher un produit de type B
		produit = fabriqueProduit.createProduit(fabriqueProduit.typeB);
		produit.methodeproduit();

		// Afficher un produit de type C
		produit = fabriqueProduit.createProduit(fabriqueProduit.typeC);
		produit.methodeproduit();

		// Afficher un produit de type D
		produit = fabriqueProduit.createProduit(fabriqueProduit.typeD);
		produit.methodeproduit();
		
		// produit inexistant
		String f = "F";
		try {
		    produit = fabriqueProduit.createProduit(f);
		    produit.methodeproduit();
		} catch (IllegalArgumentException g) {
		    System.out.println("Erreur : " + g.getMessage());
		}

	}
}
