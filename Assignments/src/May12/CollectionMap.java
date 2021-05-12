package May12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
	String empName;
	int empSalary;
	String EmpAddress;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}

	public Employee(String empName, int empSalary, String empAddress) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		EmpAddress = empAddress;
	}

	@Override
	public String toString() {
		return "empName=" + empName + ", empSalary=" + empSalary + ", EmpAddress=" + EmpAddress;
	}

}

class EmployeeDetails {
	Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	void menu() {
		String m = "menu program for map\n";
		m += "1. Add Employee. \n";
		m += "2. Remove Employee.\n";
		m += "3. find Employee.\n";
		m += "4. List Employee.\n";
		m += "5. Exit.\n";
		m += "enter your Choice.\n";

		System.out.println(m);
	}

	int addEmployee(Employee emp) {
		int result = 1;
		int num = 1;
		employeeMap.put(num, emp);
		num++;
		result--;

		return result;

	}

	int removeEmployee(int empId) {
		int result = 1;
		employeeMap.remove(empId);
		result--;
		return result;
	}

	void findEmployee(int empId) {

		System.out.println(employeeMap.get(empId));

	}

	Map<Integer, Employee> employeeList() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			map.putAll(employeeMap);
		}

		return map;
	}
}

public class CollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		EmployeeDetails obj = new EmployeeDetails();
		int res;
		while (true) {
			obj.menu();
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the employee details to add");
				res = obj.addEmployee(new Employee(sc.next(), sc.nextInt(), sc.next()));
				if (res == 0) {
					System.out.println("inserted Successfully");
				} else {
					System.out.println("Not inserted Successfully");
				}
				break;
			case 2:
				System.out.println("Enter the employee Id to Remove");
				res = obj.removeEmployee(sc.nextInt());
				if (res == 0) {
					System.out.println("Removed Successfully");
				} else {
					System.out.println("Not Removed Successfully");
				}
				break;
			case 3:
				System.out.println("Enter the employee Id to get");
				obj.findEmployee(sc.nextInt());

				break;
			case 4:
				Map<Integer, Employee> resultMap = obj.employeeList();
				if (resultMap == null) {
					System.out.println("No employee Details");
				} else {
					for (Map.Entry<Integer, Employee> entry : resultMap.entrySet()) {

						System.out.println("EmpId : " + entry.getKey() + " Employee Details: " + entry.getValue());
					}
				}
				break;
			case 5:
				System.exit(0);
			}

		}

	}

}
