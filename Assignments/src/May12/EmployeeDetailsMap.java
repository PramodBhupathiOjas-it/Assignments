package May12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetailsMap {

	int empId;
	String empName;
	
	static Map<Integer,String> empMap =new  HashMap<Integer, String>();

	public EmployeeDetailsMap() {
		super();
	}

	public EmployeeDetailsMap(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public static void addEmployee(int empId,String empName) {
		empMap.put(empId, empName);
	}
	
	public static String getEmployeeName(int empId) {
		String res = null;
		for(Map.Entry<Integer, String> entry : empMap.entrySet()) {
			if(entry.getKey() == empId) {
				res = entry.getValue();
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number employee to be added");
		int size = sc.nextInt();
		System.out.println("enter the employee details");
		for( int i =0;i < size;i++) {
			addEmployee(sc.nextInt(),sc.next());
		}
		
		System.out.println("enter Empid to find empName");
		System.out.println(getEmployeeName(sc.nextInt()));
		
		

	}

}
