package ro.ase.cts.Main1;

import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.singleton.SingleBanca;

public class Main {

	public static void main(String[] args) {
		SingleBanca singleeBanca=SingleBanca.getInstance("BCR", "centru");
		System.out.println(SingleBanca.NRCONT);
		ContBancar contBancar1=SingleBanca.createInstance("CREDIT");
		System.out.println(SingleBanca.NRCONT);
		ContBancar contBancar2=SingleBanca.createInstance("DEBIT");
		System.out.println(SingleBanca.NRCONT);
		
		ContBancar adapterCont=new AdapterCont();
		BankAccount bankAccount= new AdapterCont();
		adapterCont.transfer(contBancar1, 200);
		adapterCont.depunde(500);
		
		
		
	}

}
