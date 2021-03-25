package ro.ase.cts.seminar5.factory;

public class TechProdictFactory extends AbstractProductFactory{
	@Override
	public Product makeProduct(String productName) throws UnsupportedOperationException {
		return new TechProduct(productName);
	}

	@Override
	public String getCatalog() {
		
		return "generic - Generic tech product";
	}

}
