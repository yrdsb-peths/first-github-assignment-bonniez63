public class Student{
	private String firstName;
	private String lastName;
	private int grade;

	public Student(String fName, String lName, int gLevel){
		firstName = fName;
		lastName = lName;
		grade = gLevel;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public int getGrade(){
		return grade;
	}

	public String toString(){
	return "Student " + firstName + " " + lastName + " in grade " + grade;
	}
}