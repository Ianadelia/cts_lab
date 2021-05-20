package ro.ase.cts.seminar11.state;

public class OpenState implements GateStateInterface{

	@Override
	public void enter(Gate gate) {
		System.out.println("Enter successully");
		gate.setState(new LockedState());
		
	}

	@Override
	public void authorize(Gate gate) {
		System.out.println("Already to pass");
		
	}

}
