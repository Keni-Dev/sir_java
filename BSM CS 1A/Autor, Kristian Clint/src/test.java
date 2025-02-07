// Autor, Kristian Clint M.

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int size = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= size; i += 2) printRow(size, i);
        for (int i = size - 2; i > 0; i -= 2) printRow(size, i);
    }

    private static void printRow(int size, int stars) {
        for (int i = 0; i < (size - stars) / 2; i++) System.out.print(" ");
        for (int i = 0; i < stars; i++) System.out.print("*");
        System.out.println();
    }
}

