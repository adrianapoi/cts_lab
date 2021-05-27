package ro.ase.cts.seminar13unit.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.engine.execution.ExecutableInvoker;

import ro.ase.cts.seminar13unit.Student;
import ro.ase.cts.seminar13unit.exceptions.StudentExceptionWrongValue;

class StudentTestCase {
	/* test fixtures */
	static Student student;
	static String DEFAULT_NAME = "Anonim";
	static int DEFAULT_VARSTA = 18;
	static int DEFAULT_NOTE[];
	static int NR_NOTE_DEFAULT = 3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOTE = new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0] = 9;
		DEFAULT_NOTE[1] = 9;
		DEFAULT_NOTE[2] = 10;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOTE);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	@Test
	void testStudentConstuctorRight() {
		String studentName = "Oana";
		int studentAge = 21;
		int grades[] = { 9, 9, 9 };
		Student student = new Student(studentName, studentAge, grades);

		assertEquals(studentName, student.getNume(), "Name is not equal");
		assertEquals(studentAge, student.getVarsta(), "Age is not equal");
		assertEquals(grades, student.getNote(), "Grades is not equal");

		// varianta, dar asa nu
//		if(!student.nume.equals(studentName)) {
//			fail("Name is not equal");
//		}
	}

	@Test
	void testStudentConstructorRightNotNull() {
		int grades[] = { 9, 9, 9 };
		Student student = null;
		try {
			student = new Student("Oana", 21, grades);
		} catch (Exception e) {
			fail("Constructorul nu  trebuie sa arunce exceptie!");
		}
		assertNotNull(student);
	}

	/*
	 * error condition existance
	 */
	@Test()
	void testStudentSetVarstaErrorCondition() {
		assertThrows(StudentExceptionWrongValue.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				student.setVarsta(-1);

			}
		});
	}

	@Test
	void testStudentGetVarstaRight() {
		int expectedValue = DEFAULT_VARSTA;
		int actualValue = student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void testCalculMedieErrorCondition() {
		try {
			student.setNote(null);
		} catch (Exception e) {
			
		}
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.calculMedie();
		});
	}

	@Test
	void testCalculMedieRightDouaZecimale() throws StudentExceptionWrongValue {
		float expectedValue = 9.33f;
		float actualValue = student.calculMedie();
		assertEquals(expectedValue, actualValue);
	}
	
	//boundery check
	@Test
	void testSetNoteBoundaryCondition() {
		int invalidDataSetNote[] = new int[3];
		for (int i =0; i<2;i++) {
			invalidDataSetNote[i]=8;
		}
		invalidDataSetNote[2]=20;
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.setNote(invalidDataSetNote);
		});
	}
}