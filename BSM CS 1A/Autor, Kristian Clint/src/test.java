// Autor, Kristian Clint M.

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        	System.out.print("Enter an odd number: ");
        	try {
        		int size = scanner.nextInt();
        		if (size <= 0) {
            		System.out.println("Please enter a positive number!");
            		continue;
            	}
            	if (size % 2 == 0) {
            		System.out.println("Please enter an odd number!");
            		continue;
            	}
            	
            	for (int i = 1; i <= size; i += 2) printRow(size, i); // 5 i= 1 3 5 --- upper
            	for (int i = size - 2; i > 0; i -= 2) printRow(size, i); // 5 i = 3 1 --- lower
            	scanner.close();
            	break;
        	} catch (InputMismatchException e) {
        		System.out.println("Must be a number!");
        		scanner.nextLine();
        		continue;
        	}
        }
    }

    private static void printRow(int size, int stars) { //1 3 5
        for (int i = 0; i < (size - stars) / 2; i++) System.out.print(" "); // 5 - 1 = 4/2 = 2    5 - 3 = 2 / 2 = 1 5 - 5 = 0 
        for (int i = 0; i < stars; i++) System.out.print("*");
        System.out.println();
    }
}

