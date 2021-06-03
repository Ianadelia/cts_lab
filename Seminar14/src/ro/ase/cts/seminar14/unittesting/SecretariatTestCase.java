package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.StudentStub;
import ro.ase.cts.seminar14.TipBursaEnum;

public class SecretariatTestCase {

	DepartamentSecretariat secretariat;
	static final ArrayList<Student> DEFAULT_STUDENTS;
	static {
		DEFAULT_STUDENTS=new ArrayList<Student>();
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		int defaultNote1[]= {7,8,9};
		int defaultNote2[]= {8,9,10};
		DEFAULT_STUDENTS.add(new Student("Anonim", 99, defaultNote1));
		DEFAULT_STUDENTS.add(new Student("Anonim", 99, defaultNote2));
	}
	
	@AfterAll
	static void setAfterAllClass() throws Exception{
		
	}

	@AfterEach
	void tearDown() throws Exception{
		
	}
	
	
	@BeforeEach
	void setUp1() throws Exception {
		secretariat = new DepartamentSecretariat();
	}

	


	@Test
	void testCalculBursaStub() {
		StudentAbstract defaultStudent=new StudentAbstract() {
		public float calculMedie() throws StudentExceptionWrongValue{
			return 8;
		}
	};
	ArrayList<StudentAbstract> listaStudenti=new ArrayList<StudentAbstract>();
	listaStudenti.add(defaultStudent);
	secretariat.setStudenti(listaStudenti);
	float bura=secretariat.calculBursa(0);
	assertEquals(TipBursaEnum.MERIT.getCuantum(), bura, "cuantumul returnat nu este corect");
		secretariat.calculBursa(0);
	}
	
	@Test
	void testCalculBursaStubClasaConcreta() {
		void testCalculBursaStud() {
			StudentAbstract defaultStudent=new StudentAbstract() {
				
				@Override
				public float calculMedie() throws StudentExceptionWrongValue {
					// TODO Auto-generated method stub
					return 8;
				}
			};
			
			ArrayList<StudentAbstract> listaStudenti=new ArrayList<StudentAbstract>();
			listaStudenti.add(defaultStudent);
			secretariat.setStudenti(listaStudenti);
			
			//secretariat.calculBursa(0);
	
}
	}
		
