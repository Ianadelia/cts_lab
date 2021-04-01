package ro.ase.cts.seminar5.factory;

public class TechProduct implements Product{
	String productName;
	String manufacturer;
	String displayType;
	String model;
	float price;
	
	private TechProduct() {
		
		
	}
	
	public TechProduct(String productName) {
		
		super();
		this.productName=productName;
		
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a tech product";
	}
}
