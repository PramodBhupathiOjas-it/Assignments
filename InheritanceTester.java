package java22May;

enum ManagerType {
	HR, SALES;
}

class Employee {
	int emp_id;
	String emp_name;
	double emp_salary;

	public Employee() {
		super();
	}

	public Employee(int emp_id, String emp_name, double emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}

}

class Manager extends Employee {

	ManagerType type;

	public Manager(ManagerType type, int emp_id, String emp_name, double emp_salarye) {
		super(emp_id, emp_name, emp_salarye);
		this.type = type;
		setSalary(type);
	}

	private void setSalary(ManagerType type) {
		if (type == type.HR) {
			super.emp_salary += 10000;

		} else {
			super.emp_salary += 5000;
		}

	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary
				+ "]";
	}

}

class Clerk extends Employee {
	int speed;
	int accurecy;

	public Clerk() {
		super();
	}

	public Clerk(int speed, int accurecy, int emp_id, String emp_name, double emp_salarye) {
		super(emp_id, emp_name, emp_salarye);
		this.speed = speed;
		this.accurecy = accurecy;
		setSalary(speed, accurecy);
	}

	private void setSalary(int speed, int accurecy) {
		if (speed > 70 && accurecy > 80) {
			super.emp_salary += 1000;

		}

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccurecy() {
		return accurecy;
	}

	public void setAccurecy(int accurecy) {
		this.accurecy = accurecy;
	}

	@Override
	public String toString() {
		return "Clerk [speed=" + speed + ", accurecy=" + accurecy + ", emp_id=" + emp_id + ", emp_name=" + emp_name
				+ ", emp_salary=" + emp_salary + "]";
	}

}

public class InheritanceTester {

	public static void main(String[] args) {
		Employee e = new Manager(ManagerType.HR, 1, "pramod", 10000);
		Employee e1 = new Manager(ManagerType.SALES, 1, "bhupathi", 10000);
		System.out.println(e);
		System.out.println(e1);

		Clerk clerk = new Clerk(90, 100, 1, "fayaz", 15000);
		System.out.println(clerk);
		clerk.setSpeed(95);
		System.out.println(clerk);

	}

}