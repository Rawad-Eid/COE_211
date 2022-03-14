import java.util.Scanner;
public class employee {


	    private String firstName;
	    private String lastName;
	    private int age; 
	    private double salary;
	    
	    public employee() {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	
	    	System.out.println("Please input employee's First Name: ");
	    	firstName = scan.nextLine();
	    	
	    	
	    	System.out.println("Please input employee's Last Name: ");
	    	lastName = scan.nextLine();
	    	
	    	System.out.println("Please employee's input Age: ");
	    	age = scan.nextInt();
	    	
	    	
	    	System.out.println("Please input employee's Salary: ");
	    	salary = scan.nextDouble();
	    	
	    	
	    }
	 
	    public String toString() {
	    	
	    	return "employee information: " + firstName+" "+lastName+" "+age+" "+salary; 
	    }
}