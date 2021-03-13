package calculator;
import java.util.*;
import java.lang.math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String args[])
    {
        int choice, flag=0;
        double num1,num2;int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        do {
            System.out.println("1 for Natuaral log\n2 for Square root\n3 for Power\n4 for Factorial\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){
            	 	
                 System.out.print("Enter number 1: ");
                 
                 System.out.print("Enter number 2: ");
                 num2 = scan.nextDouble();
                 
                 switch(choice) {
                 case 1: 	System.out.println("Enter a number");
                 		num1 = scan.nextDouble();
                 		System.out.println("Natural Log of "+num1+" is" + Log(num1));
                 		break;
                 case 2: 	System.out.println("Enter a number");
                 		num1 = scan.nextDouble();
                 		System.out.println("Square root of "+num1+" is" + Sqrt(num1));
                 		break;
                 case 3: 	System.out.println("Enter 2 numbers");
                 		System.out.println("Enter number 1");
                 		num1 = scan.nextDouble();
                 		System.out.println("Enter number 2");
                 		num2 = scan.nextDouble();
                 		System.out.println(num1+" to the power of  "+num2+" = "+Power(num1, num2));
                 		break;
                 case 4: 	System.out.println("Enter a number");
                 		a = scan.nextInt();
				 System.out.println("Factorial of " + a + " = " + Factorial(a));
						break;
                default: System.out.println("Exiting, Bye");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
    // log files , function update : log base e ,pom.sml add log file dependency, sqrt,power,factorial , write logs based on edge cases,update your test cases accordingly, el ka stack 
    static double Log(double a) {
    	logger.info("Taking natural log of " + a );
    	return Math.log(a);
    }
    static double Sqrt(double a) {
    	logger.info("Finding sqrt of " + a);
    	return Math.sqrt(a);
    }
    static double Power(double a, double b) {
    	logger.info("Calculating " + num1+" to the power of  "+num2);
    	return Math.pow(a,b);
    }
    static long Factorial(int a) {
    logger.info("Calculating " + a +"'s factorial ");
    	long ans=1;
	    	while(a>0)
	    	{
	    	ans = ans*a;
	    	a--;
	   	 }
   	 return ans;
   }
}
