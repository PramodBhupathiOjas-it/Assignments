package java22May;

class Student {
	int student_id;
	String s_name;
	double exam_fees;

	Student() {
		this.student_id = 0;
		this.s_name = null;
		this.exam_fees = 0.0;
	}

	public Student(int student_id, String s_name, double exam_fees) {
		super();
		this.student_id = student_id;
		this.s_name = s_name;
		this.exam_fees = exam_fees;
	}

	double payFee(int amount) {

		return amount;

	}

	String displayDetails() {
		return "StudentId : " + student_id + " \r " + " studengtName : " + s_name + " \r " + " examFees : " + exam_fees;
	}

}

class DayScholar extends Student {
	double transportFee;

	DayScholar() {
		this.transportFee = 0.0;
	}

	public DayScholar(int student_id, String s_name, double exam_fees, double transportFee) {
		super(student_id, s_name, exam_fees);
		this.student_id = student_id;
		this.s_name = s_name;
		this.exam_fees = exam_fees;
		this.transportFee = transportFee;
	}

	String displayDetails() {
		return "StudentId : " + student_id + " \r " + " studengtName : " + s_name + " \r " + " examFees : " + exam_fees
				+ " \r " + " TransportFees : " + transportFee;
	}

	double payFee(int amount) {
		if (amount == (exam_fees + transportFee)) {
			System.out.println("No Due Balance : -----");
		}
		return amount - exam_fees - transportFee;

	}

}

class Hosteller extends Student {
	double hostelFee;

	Hosteller() {
		this.hostelFee = 0.0;
	}

	public Hosteller(int student_id, String s_name, double exam_fees, double hostelFee) {
		super(student_id, s_name, exam_fees);
		this.student_id = student_id;
		this.s_name = s_name;
		this.exam_fees = exam_fees;
		this.hostelFee = hostelFee;
	}

	String displayDetails() {
		return "StudentId : " + student_id + " \r " + " studengtName : " + s_name + " \r " + " examFees : " + exam_fees
				+ " \r " + " hostelFee : " + hostelFee;
	}

	double payFee(int amount) {
		if (amount == (exam_fees + hostelFee)) {
			System.out.println("No Due Balance : -----");
		}
		return amount - exam_fees - hostelFee;
	}

}

public class StudentInheritance {

	public static void main(String[] args) {
		// Student obj = new Student(100, "pramod",5000);
		Student s1 = new DayScholar(101, "pramod", 7000, 5000);
		System.out.println(s1.payFee(10000));
		System.out.println(s1.displayDetails());

		Student s2 = new Hosteller(121, "mustafa", 20000, 40000);
		System.out.println(s2.payFee(10000));
		System.out.println(s2.displayDetails());

	}

}
