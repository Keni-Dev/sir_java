// Zamora, Kenny Ivan S.A.
import java.util.Scanner;


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Welcome");
//		
//		int a = 1;
//		while (a <= 5) {
//			System.out.println("Itter: "+a);
//			a++;
//		}
//		
//		int b = 1;
//		do {
//			System.out.println("Itter: " + b);
//			b++;
//		} while (b<=5);
//		
//	
//		for(a=1;a<=5;a+=2) {
//			System.out.println("letter: " + a);
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = scan.nextLine();
//		System.out.println("Your name is: " + name);
//		scan.close();
//			
		Scanner scan = new Scanner(System.in);
		int[] odd;
		int[] even;
		
		while (true) {
			System.out.println("Enter your number: ");
			
			int num = scan.nextInt();		
			System.out.println(num);
			
			if (num == -1) {
				break;
			}
			
		}
		
	}
}
