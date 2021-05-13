package ro.ase.cts.factory;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depunde(double suma);
	
}
