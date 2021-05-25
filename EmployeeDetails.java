package java22May;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Employees22{
	int employeeId;
	String employeeName;
	String desigination;
	double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees22(int employeeId, String employeeName, String desigination, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.desigination = desigination;
		this.salary = salary;
	}
	public Employees22() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", desigination="
				+ desigination + ", salary=" + salary + "]";
	}
	
	
}

class FileReadException extends IOException{
	String str;

	public FileReadException(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "FileReadException Occured : " + str;
	}
	
	
	
}

public class EmployeeDetails {
	
	static List<Employees22> employeeList = new ArrayList<Employees22>();

	public List<Employees22> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employees22> employeeList) {
		this.employeeList = employeeList;
	}

	public EmployeeDetails() {	
		super();
	}
	
	public static void getEmployeeFileList() {

		for(Employees22 ee : employeeList) {
			System.out.println(ee);
		}

	}
	
	
	public static void readEmployeeDetails(String filename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		String line = null;
		while((line= br.readLine())!=null) {

		String[] splitLine = line.split(";");
		int empId = Integer.parseInt(splitLine[0]);
		String empName = splitLine[1];
		String designation = splitLine[2];
		int marks = Integer.parseInt(splitLine[3]);

		employeeList.add(new Employees22(empId, empName, designation, marks));

		}

		
	}
	
	public static void main(String[] args) throws IOException  {
		try {
		readEmployeeDetails("D:\\pramod.txt");
		getEmployeeFileList();
		}catch (FileReadException e) {
			System.out.println(e);
		}
	}
	

}
