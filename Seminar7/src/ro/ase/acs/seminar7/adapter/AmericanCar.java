package ro.ase.acs.seminar7.adapter;

public class AmericanCar implements MovableImperial{

	private String model;
	
	public AmericanCar(String model) {
		super();
		this.model = model;
	}

	@Override
	public int getMaxSpeed() {
		//imperial system
		return 200;
	}

}
