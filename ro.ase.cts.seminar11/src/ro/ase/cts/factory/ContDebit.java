package ro.ase.cts.factory;

public class ContDebit implements ContBancar{

	private double total=1000;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total+=suma;
		destinatie.depunde(suma);
		System.out.println( suma + "de lei a fost adaugata in "+destinatie + "->cont Debit");
		
	}

	@Override
	public void depunde(double suma) {
		total+=suma;
		System.out.println(suma +"de lei a fost adaugata in contul curent -> Debit");
	}

	@Override
	public String toString() {
		return "ContDebit [total=" + total + "]";
	}
	

}
