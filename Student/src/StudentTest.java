import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

	@Test
	public void testStudentNameId() {
		String name = "Shweta";
		int id = 1;
		Student student = new Student(id, name);

		Assert.assertEquals(name, student.getName());
		Assert.assertEquals(id, student.getId());
	}

	@Test
	public void testStudentAge() {
		int age = 23;
		Student student = new Student(1, "Shweta");
		student.setAge(age);

		Assert.assertEquals(age, student.getAge());
	}

	@Test
	public void testStudentDepartment() {
		String department = "Computer Science";
		Student student = new Student(1, "Shweta");
		student.setDepartment(department);

		Assert.assertEquals(department, student.getDepartment());
	}

}
