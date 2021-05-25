package java22May;

abstract class Student11 {
	String student_name;
	String student_class;
	protected static int total_no_of_students;

	abstract double getPercentage();

	static void getTotalNoStudents(int total_students) {
		total_no_of_students = total_students;
	}

	public Student11() {
		super();
	}

	public Student11(String student_name, String student_class) {
		super();
		this.student_name = student_name;
		this.student_class = student_class;
	}

}

class ScienceStudent extends Student11 {

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks, String student_name,
			String student_class) {

		super(student_name, student_class);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	double getPercentage() {
		// System.out.println((physicsMarks + chemistryMarks + mathsMarks) / 3 * 100);
		return (physicsMarks + chemistryMarks + mathsMarks) / 3;

	}

	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", student_name=" + student_name + ", student_class=" + student_class + " Percentage = "
				+ getPercentage() + " Total No Of Students =" + total_no_of_students + "]";
	}

}

class HistoryStudent extends Student11 {

	int historyMarks;
	int civicsMarks;

	public HistoryStudent(int historyMarks, int civicsMarks, String student_name, String student_class) {
		super(student_name, student_class);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	double getPercentage() {
		// System.out.println((historyMarks + civicsMarks ) / 2 * 100);
		return (historyMarks + civicsMarks) / 2;

	}

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", student_name="
				+ student_name + ", student_class=" + student_class + " Percentage = " + getPercentage()
				+ " Total No Of Students =" + total_no_of_students + "]";
	}

}

public class StudentAbstractDemo {

	public static void main(String[] args) {
		Student11 obj = new ScienceStudent(85, 90, 77, "pramod", "sceince");
		obj.total_no_of_students = 40;
		System.out.println(obj);
		Student11 obj1 = new HistoryStudent(85, 78, "rahul", "History");
		System.out.println(obj1);
		// ScienceStudent science = new ScienceStudent(0, 0, 0);

	}

}
