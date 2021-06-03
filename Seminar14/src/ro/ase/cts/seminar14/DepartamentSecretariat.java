package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {

	private static final int MIN_MEDIE_MERIT=8;
	private static final int MIN_MEDIE_EXCELENTA=9;
	ArrayList<Student> studenti;

	public DepartamentSecretariat() {
		studenti=new ArrayList<Student>();
	}
	public DepartamentSecretariat(ArrayList<Student> studenti) {
		super();
		this.studenti = studenti;
	}
	
	
	public float calculBursa(int studentIndex) {
		float medieStudent=0;
		try {
			medieStudent = studenti.get(studentIndex).calculMedie();
		} catch (StudentExceptionWrongValue e) {
			System.out.println(e.getMessage());
		}
		if(medieStudent>MIN_MEDIE_EXCELENTA) {
			return TipBursaEnum.EXCELENTA.getCuantum();
		}else if(medieStudent>MIN_MEDIE_MERIT) {
			return TipBursaEnum.MERIT.getCuantum();
		}else{
			return 0;
		}
		
	}
	public ArrayList<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}
	
	
	
}
