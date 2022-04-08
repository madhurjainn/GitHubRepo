package Organization;

public class Client {

	public static void main(String[] args) {
		Employeee obj=new Manager();
		System.out.println("Salary of Manager is: "+obj.calculateSalary(10000.0,9,5));
		Employeee obj1=new Labour();
		System.out.println("Salary of Labour is:"+obj1.calculateSalary(5000.0, 9, 3));
		
		
	}

}
