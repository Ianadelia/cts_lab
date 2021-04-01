package ro.ase.cts.seminar6.builder;

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
		
		return "This is a tech product";
	}
	
}
