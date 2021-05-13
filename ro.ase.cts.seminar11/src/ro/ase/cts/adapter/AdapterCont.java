package ro.ase.cts.adapter;

import ro.ase.cts.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar{

	private double total=500;
	@Override
	public void accountTrasfer(BankAccount account, double amount) {
		this.transfer(this, amount);
		
	}

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

}
