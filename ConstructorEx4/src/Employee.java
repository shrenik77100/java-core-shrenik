
public class Employee {
	
	public int empCode;
	public String empName;
	public double salary;
	
//	Alt + Shift + S -> O
	
	public Employee() {}
	
	public Employee(int empCode, String empName, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void showEmployee()
	{
		System.out.println(this.empCode + "\t" + this.empName + "\t" + this.salary);
	}
	
}
