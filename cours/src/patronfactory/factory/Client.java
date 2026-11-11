package patronfactory.factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("********* Methode2 Factory Abstract ***********");
		   
		     ProduitFactory produitFactoryA = new ProduitFactoryA();
		     ProduitFactory produitFactoryB = new ProduitFactoryB();
		     ProduitFactory produitFactoryC = new ProduitFactoryC();
		     Produit produit= null;
		     
		     produit =  produitFactoryA.getProduit();
		     produit.methodeProduit();
		     
		     produit =  produitFactoryB.getProduit();
		     produit.methodeProduit();
		     
		     
		     produit =  produitFactoryC.getProduit();
		     produit.methodeProduit();
	}

}
