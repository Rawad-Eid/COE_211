import java.util.Scanner; 

public class Entrypoint {

	public static void main(String[] args) {
		
		String firstname, lastname;
		int age;
		double monthlysalary;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the employee's first name: ");
		firstname = scan.next(); 
		
		
		System.out.println("Please input the employee's last name: ");
		lastname = scan.next(); 
		
		
		System.out.println("Please input the employee's age: ");
		
		age = scan.nextInt(); 
		
		System.out.println("Please input the employee's monthly salary: ");
		monthlysalary = scan.nextDouble();
		
		System.out.println("Employee Information: " + firstname +", " + lastname + ", " + age + ", " + monthlysalary);
		

	}

}
