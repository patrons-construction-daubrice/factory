package patronfactory.factory;

public class ProduitFactoryD extends ProduitFactory{

	@Override
	protected Produit createProduit() {
		Produit produit =null;
		produit = new ProduitD();
		return produit;
	}


}
