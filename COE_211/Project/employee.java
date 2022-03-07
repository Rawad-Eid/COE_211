import java.util.Scanner;
public class employee {


	    private String firstName;
	    private String lastName;
	    private int age; 
	    private double salary;
	    
	    
	 private Employee (String fn, String ln, int age, double sal){
	       
	        firstName=fn;
	        lastName=ln;
	        salary=sal;
	    }
	    
	 
	 private String getFirstName(){
	        return firstName;
	    }
	 private String getLastName(){
	        return lastName;
	    }

	 private int getSalary(){
	        return (double) salary;
	        
	    }
	 
	 private int getAge() {
		 	return (int) age;
	 }

	
	 
	    
	    public String toString(){
	    	String s="Employee [firstName="+getFirstName()+", lastName="getLastName()+", age="+getAge()+", salary="getSalary()+"]";
	        return s;
	    }


	}
