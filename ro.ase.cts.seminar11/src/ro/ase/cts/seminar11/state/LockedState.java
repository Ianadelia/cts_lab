package ro.ase.cts.seminar11.state;

public class LockedState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
	  System.out.println("you must authentificate yourself first!");
		
	}

	@Override
	public void authorize(Gate gate) {
		System.out.println("");
		gate.setState(new OpenState());
	}

}
