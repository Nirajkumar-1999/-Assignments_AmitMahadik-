import java.util.Scanner;
class ArmstrongOrNot{
	public void find(int n) {
		int temp = n;
		int res = 0;
		int rem;
		while(temp>0) {
			rem = temp%10;
			res = (int) (res + Math.pow(rem, 3));
			temp = temp/10;
		}
		if(res == n) {
			System.out.print("Armstrong.");
		} else {
			System.out.print("Not an Armstrong.");	
		}
	}
}
public class Assignment1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is armstrong or not: ");
		int number  = sc.nextInt();
		ArmstrongOrNot a = new ArmstrongOrNot();
		a.find(number);
	}

}
