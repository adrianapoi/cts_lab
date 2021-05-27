package ro.ase.cts.seminar13unit.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13unit.Student;
import ro.ase.cts.seminar13unit.exceptions.StudentExceptionWrongValue;

class StudentTestCase {
	/* test fixtures */
	Student student;
	String defaultName = "Anonim";
	int defaultVarsta = 18;
	int defaultNote[] = {};

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(defaultName, defaultVarsta, defaultNote);
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

	@Test()
	void testStudentSetVarstaErrorCondition(){
		try {
		student.setVarsta(-1);
		fail("Expected an exception");
	}catch(StudentExceptionWrongValue ex) {
		
	}
	}
}