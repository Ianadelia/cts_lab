package ro.ase.acs.seminar7.adapter;

public class AdapterMetric implements MovableImperial{
	private final double multiplier=1.609344d;
private EuropeanCar euroCar;

public AdapterMetric(EuropeanCar euroCar) {
	super();
	this.euroCar = euroCar;
}
	public int getMaxSpeed() {
		return kmToMiles();
	}
	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed()* multiplier);
	}
	
}
