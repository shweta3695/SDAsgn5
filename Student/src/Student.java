public class Student {

	private String name;
	private int id;
	private String phone;
	private String address;
	private int age;
	private String department;

	public Student(final int id, final String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(final String phone) {
		this.phone = phone;
	}

	String getAddress() {
		return address;
	}

	void setAddress(final String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(final String department) {
		this.department = department;
	}

	public static void main(String[] args) {
		Student student = new Student(1,"Shweta");
		student.setAddress("Sadaphuli,Kothrud,Pune");
		student.setAge(23);
		student.setDepartment("Computer Science");
		student.setPhone("999999999");
		
		System.out.println("ID : "+student.getId());
		System.out.println("Name : " + student.getName());
		System.out.println("Age : "+student.getAge());
		System.out.println("Address : "+student.getAddress());
		System.out.println("Phone : "+student.getPhone());
		System.out.println("Department : "+student.getDepartment());
		
	}

}