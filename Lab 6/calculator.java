import java.util.Scanner;
public class calculator {

	

	
	    private int num1;
	    private int num2;
	    private int result;
	    private String operator;
	    
	    public calculator() {
	
	    	
	    
	    
	        Scanner scanCalc = new Scanner(System.in);
	        
	        System.out.println("Input First Number:");
	        num1 = scanCalc.nextInt();
	        scanCalc.nextLine();
	        
	        System.out.println("Input Operator: +, -, *, or /");
	        operator = scanCalc.nextLine();
	        
	        
	        System.out.println("Input Second Number:");
	        num2 = scanCalc.nextInt();
	        scanCalc.nextLine();
	        
	        
	        switch (operator) {
	        
	        case "+":
	        	result = num1 + num2;
	        	System.out.println(num1 + "+" + num2 + "=" + result);
	        	break;
	        	
	        case "-":
	        	result = num1 - num2;
	        	System.out.println(num1 + "-" + num2 + "=" + result);
	        	break;
	        	
	        
	        	
	        case "x":
	        	result = num1 * num2;
	        	System.out.println(num1 + "x" + num2 + "=" + result);
	        	break;
	        	
	        case "/":
	        	result = num1 / num2;
	        	System.out.println(num1 + "/" + num2 + "=" + result);
	        	break;
	        	
	
	                
	        
	        
	        }
	        
	    }
	    
	    
	    public String add(int a, int b) {
	        return a+ "+" + b + "=" + (a+b);
	    }

	    public String subtract(int a, int b) {
	    	return a+ "-" + b + "=" + (a-b);
	    }

	    public String multiply(int a, int b) {
	    	return a+ "*" + b + "=" + (a*b);
	    }

	    public String divide(int a, int b) {
	    	return a+ "/" + b + "=" + (a/b);
	    }
	}


