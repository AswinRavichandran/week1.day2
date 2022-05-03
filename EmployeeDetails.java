package week1.day2;

public class EmployeeDetails {
	
	private static EmployeeDetails mon;
	void printEmployeeName(String empName,int empId) {
		System.out.println(empName);
		System.out.println(empId);
		
		}
	void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	void printEmployeeMobileNumber(long mob) {
		System.out.println(mob);
	}
public static void main(String[] args) {
	EmployeeDetails.mon=new EmployeeDetails();
	mon.printEmployeeName("Aswin",101);
	mon.getEmployeeAddress("Tiruppur");
	mon.printEmployeeSalary(1526.25152);
	mon.printEmployeeMobileNumber(8549658659l);
	
}
}
