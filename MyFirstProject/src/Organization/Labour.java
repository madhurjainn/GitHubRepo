package Organization;

public class Labour extends Employeee{
	
	public double calculateSalary(Double salary,int hours,int overtime) {
		double result=(salary+overtime)*100;
		
		return result;
		

}
}