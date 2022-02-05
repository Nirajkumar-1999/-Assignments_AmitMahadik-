import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0; 
		
		try {
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		
		c = b/a;
		System.out.println("b/a is: "+ c);
		    
		}

	}

}
