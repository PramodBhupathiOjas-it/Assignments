package java22May;

class Student1 {
	public int studentId;
	public String studentName;
	private int studentMarks;
	private char studentGrade;

	public Student1(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		calculateGrade(studentMarks);
	}

	private void calculateGrade(int studentMarks) {
		if (studentMarks >= 90)
			studentGrade = 'A';
		else if (studentMarks < 90 || studentMarks >= 80)
			studentGrade = 'B';
		else if (studentMarks < 80 || studentMarks >= 70)
			studentGrade = 'C';
		else if (studentMarks < 70 || studentMarks >= 60)
			studentGrade = 'D';
		else
			studentGrade = 'E';
	}

	String displayDetails() {
		return "StudentId : " + studentId + " , StudentName : " + studentName + " , studentMarks : " + studentMarks
				+ " , studentGrade : " + studentGrade;

	}
}

public class StudentAccessModifiers {

	public static void main(String[] args) {
		Student1 s = new Student1(111703917, "pramod", 99);
		System.out.println(s.displayDetails());
	}

}