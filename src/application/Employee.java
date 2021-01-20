package application;

public class Employee {
	
	public enum Covid {
		Positive,
		Contact,
		Negative
	}
	
	int id;
	int department;
	String firstName;
	String lastName;
	String email;
	Covid status;
	
	public Employee(int id, int department, String firstName, String lastName, String email, Covid status) {
		this.id = id;
		this.department = department;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public int getDepartment() {
		return department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Covid getStatus() {
		return status;
	}

	public void setStatus(Covid status) {
		this.status = status;
	}
}
