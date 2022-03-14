import java.util.Scanner;
public class entry_point {

	public static void main(String[] args) {
		
		int wxyz;
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Which service would you like to use?\r\n"
			+ "[1]: Basic week visualizer\r\n"
			+ "[2]: Advanced week visualizer\r\n"
			+ "[3]: Basic calculator\r\n"
			+ "[4]: Employee repertoire\r\n"
			+ ""); 
	wxyz = scan.nextInt();
	scan.nextLine();
	
		switch(wxyz) {

		case 1: 
			
			basic_week obj1 = new basic_week();
			obj1.printDays();
			
			
		break;
		
		case 2:
			
			advanced_week obj2 = new advanced_week();
			obj2.printDays();
			
			break;
			
		case 3:
			
			calculator obj3 = new calculator();
		
			break;
			
		case 4: 
			
			employee obj4 = new employee();
			System.out.println(obj4);
			break;
			
			
		}}}
	



