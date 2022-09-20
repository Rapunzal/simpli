package mypackage;

public class Employee {

	int empNo;
	String empName;
	double salary;
	String Designation;
	public Employee(int empNo, String empName, Double salary, String designation) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		Designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee No is"+this.getEmpNo()+" Name "+this.getEmpName()+" salary "+this.getSalary()+"Designation";
		+this.getDesignation();
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return Designation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(101,"John",2000000.00,"Project Manager");
		System.out.println(emp.toString());
		
	}

}
