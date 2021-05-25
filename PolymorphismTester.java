package java22May;

class Employee5 {
	int empid;
	String empName;
	double basicSal;
	double grossSal;

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public Employee5(int empid, String empName, double basicSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.basicSal = basicSal;
	}

	public Employee5() {
		super();
	}

	public void setGrossSalary(double basicSal) {

		grossSal = basicSal;

	}

	@Override
	public String toString() {
		return "Employee5 [empid=" + empid + ", empName=" + empName + ", basicSal=" + basicSal + ", grossSal="
				+ grossSal + "]";
	}

}

class Manager1 extends Employee5 {

	public Manager1() {
		super();
	}

	public Manager1(int empid, String empName, double basicSal) {
		super(empid,empName,basicSal);
	}

	@Override
	public void setGrossSalary(double basicSal) {
		super.setGrossSalary(basicSal);
		grossSal = basicSal + (0.15 * basicSal);
	}
	
	public void displayManager() {
		System.out.println("Manager [employeeId=" + empid + ", employeeName=" + empName + ", basicSalary=" + basicSal
				+ ", grossSalary=" + grossSal + "]");
	}

}

class Trainee extends Employee5 {
	public Trainee() {

	}

	public Trainee(int empid, String empName, double basicSal) {
		super(empid,empName,basicSal);
		
	}

	@Override
	public void setGrossSalary(double basicSal) {
		super.setGrossSalary(basicSal);
		grossSal = basicSal + (0.10 * basicSal);
	}

	public void displayTrainee() {
		System.out.println("Trainee [employeeId=" + empid + ", employeeName=" + empName + ", basicSalary=" + basicSal
				+ ", grossSalary=" + grossSal + "]");
	}
}

public class PolymorphismTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 e = new Employee5(101, "pramod", 10000);
		e.setGrossSalary(e.getBasicSal());
		System.out.println(e);

		Manager1 m = new Manager1(102, "Bhupathi", 10000);
		m.setGrossSalary(m.getBasicSal());
		m.displayManager();

		Trainee t = new Trainee(103, "fayaz", 10000);
		t.setGrossSalary(t.getBasicSal());
		t.displayTrainee();

	}

}
