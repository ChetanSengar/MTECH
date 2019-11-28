package wims_2017.ses5;

public class Teacher {

	private String designation = "Senior Teacher";
	private String collegeName = "BITS";
	
	public Teacher (String name, String Desig) {
		this.designation = Desig;
		this.collegeName = name;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	
	void does() {
		System.out.println("This is a teacher Object who Teaches");
	}
}
