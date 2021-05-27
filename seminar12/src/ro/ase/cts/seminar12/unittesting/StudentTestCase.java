package ro.ase.cts.seminar12.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass Class was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass Class was called");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp Class was called");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown Class was called");

	}

	@Test
	void testStudentConstructorRight() {
		String studentName = "Adriana";
		int studentAge = 21;
		int grades[] = { 9, 9, 10 };
		Student student = new Student(studentName, studentAge, grades);
		assertEquals(studentName, student.nume,"Name is not equal");
		assertEquals(studentAge, student.varsta,"Age is not equal");
		assertEquals(grades, student.note,"Grades are not equals");

	}

	@Test
	void test2() {
		fail("Not yet implemented - test2");

	}

}
