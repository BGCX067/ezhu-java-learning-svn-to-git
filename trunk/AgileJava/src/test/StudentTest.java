public class StudentTest extends junit.framework.TestCase {
	public void testCreate() {
		Student firstStudent = new Student(firstStudentName);

		Student secondStudent = new Student("James Shi");

		assertEquals(firstStudentName, firstStudent.getName());
		assertEquals(secondStudentName, secondStudent.getName());
	}

	private final String firstStudentName = "Edward Zhu";
	private final String secondStudentName = "James Shi";
}
