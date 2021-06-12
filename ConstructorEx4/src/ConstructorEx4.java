// Note: If .java files or class files are in same package then without import you can create objects of class

public class ConstructorEx4 {

	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse");
		
		
		Employee e1 = new Employee(193, "Sujit", 8000.00);
		
		e1.showEmployee();
	}
}
