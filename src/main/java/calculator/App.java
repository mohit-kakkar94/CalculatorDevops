package calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String args[])
    {
        int choice, flag=0;
        double num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        do {
            System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){
            	 System.out.println("Enter two numbers");
                 System.out.print("Enter number 1: ");
                 num1 = scan.nextDouble();
                 System.out.print("Enter number 2: ");
                 num2 = scan.nextDouble();
                 
                 switch(choice) {
                 case 1: System.out.println(num1+" + "+num2+" = "+Add(num1, num2));
                 		break;
                 case 2: System.out.println(num1+" - "+num2+" = "+Subtract(num1, num2));
                 		break;
                 case 3: System.out.println(num1+" * "+num2+" = "+Multiply(num1, num2));
                 		break;
                 case 4: System.out.println(num1+" / "+num2+" = "+Divide(num1, num2));
                		break;
                default: System.out.println("Exiting, Bye");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
    
    static double Add(double a, double b) {
    	logger.info("Adding two numbers" + a + " and " + b);
    	return a + b;
    }
    static double Subtract(double a, double b) {	
    	logger.info("Subtracting two numbers" + a + " and " + b);
    	return a - b;
    }
    static double Multiply(double a, double b) {
    	logger.info("Multiplying two numbers" + a + " and " + b);
    	return a * b;
    }
    static double Divide(double a, double b) {
    	logger.info("Dividing two numbers" + a + " and " + b);
    	if (b == 0) {
    		throw new IllegalArgumentException("Divisor cannot be zero, Exiting");
    	}
    	else return a / b;
    }
}
