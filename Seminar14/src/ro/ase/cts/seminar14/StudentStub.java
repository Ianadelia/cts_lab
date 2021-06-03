package ro.ase.cts.seminar14;

import java.nio.file.attribute.FileOwnerAttributeView;

public class StudentStub extends StudentAbstract{

	float calculMedieReturnValue=0;
	boolean exceptionalCase=false;
	
	
	
	
	
	public void setExceptionalCase(boolean exceptionalCase) {
		this.exceptionalCase = exceptionalCase;
	}



	public void setCalculMedieReturnValue(float calculMedieReturnValue) {
		this.calculMedieReturnValue = calculMedieReturnValue;
	}



	@Override
	public float calculMedie() throws StudentExceptionWrongValue {
		// TODO Auto-generated method stub
		if(exceptionalCase)
			throw new StudentExceptionWrongValue("exceptie calcul medie");
		return calculMedieReturnValue;
	
}
}
