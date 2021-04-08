package ro.ase.cts.main;
import java.util.ArrayList;

import ro.ase.acs.seminar7.adapter.AdapterMetric;
import ro.ase.acs.seminar7.adapter.AmericanCar;
import ro.ase.acs.seminar7.adapter.Lamborghini;
import ro.ase.acs.seminar7.adapter.MovableImperial;
public class Main {

	
	public static void main(String[] args) {
		ArrayList<MovableImperial> cars = new ArrayList<MoveableImperial>();
		cars.add(new AmericanCar("Ford"));
		cars.add(new AmericanCar("Chevrolet"));
		cars.add(new AmericanCar("Dodge"));
		
		Lamborghini lambo = new Lamborghini("Aventador");
		
		AdapterMetric adapter = new AdapterMetric(lambo);
		cars.add(adapter);
		
		for(MovableImperial car : cars)
		{
			System.out.println("Max speed is " + car.getMaxSpeed());
		}
		
		System.out.println(cars.get(0).getMaxSpeed());
		

	}

}
