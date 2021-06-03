package ro.ase.cts.seminar14.unittesting;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;

class StudentTestCase {
 /*text fixtures*/
	static Student student;
	static String DEFAULT_NAME="Anonim";
	static int DEFAULT_VARSTA=18;
	static int DEFAULT_NOTE[]= {};
	static int NR_NOTE_DEFAULT=3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOTE= new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0]= 0;
		DEFAULT_NOTE[1]= 9;
		DEFAULT_NOTE[2]= 10;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOTE);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	
	//ordonance test
	@Test
	void testCalculMedieOrdonance() throws ro.ase.cts.seminar14.StudentExceptionWrongValue {
		
		//specific testului de ordonare este faptul ca inputul este dat intr-o anumita ordine
		int note[]= {10,9,8,7,6};
	    student.setNote(note);
		float medie=student.calculMedie();
		float expectedMedie=8;
		assertEquals(expectedMedie, medie, "Media nu corespude");
	}
	
	//cardinality test -one element
	
	@Test
	void testCalculMedieCardinalityOne() 
	{
		int note[]=new int[1];
		note[0]=8;
		try {
			student.setNote(note);
		} catch (StudentExceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
		
	}
	//cardinality test -zero elements
	@Test
	void testCalculMedieCardinalityZero() 
	{
		int note[]=new int[3];
		try {
			student.setNote(note);
		} catch (StudentExceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
		
	}
}