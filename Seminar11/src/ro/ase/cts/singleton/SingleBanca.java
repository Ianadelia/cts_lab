package ro.ase.cts.singleton;

import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.factory.ContCredit;
import ro.ase.cts.factory.ContDebit;

public class SingleBanca {

	private String denumire;
	private String adresa;
	public static int NRCONT;
	
	private static SingleBanca INSTANCE;
	
	private SingleBanca(String denumire, String adresa) {
		this.denumire=denumire;
		this.adresa=adresa;
	}
	
	public static synchronized SingleBanca getInstance(String denumire, String adresa) {
		if(INSTANCE==null) 
			INSTANCE=new SingleBanca(denumire, adresa);
					return INSTANCE;
		}
	
	public static ContBancar createInstance(String tipCont) {
		ContBancar contBancar;
		switch(tipCont) {
		case "CREDIT": 
			contBancar=new ContCredit();
			NRCONT++;
			//return new ContCredit();
			
			break;
		case "DEBIT":
			contBancar=new ContDebit();
			NRCONT++;
			//return new ContDebit();
			break;
			default:
				contBancar=null;
				return null;
		}
		return contBancar;
	}
}
