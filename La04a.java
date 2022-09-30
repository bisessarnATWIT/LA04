import java.util.Scanner;

public class la04 {

	public la04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int t = gcd(a,b);
		System.out.println("The GCD of " + a + " and " + b + " is " + t);
		
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int t;
			t=b;
			b = a % b;
			a = t;	
		}
		return a; 
	}

}
