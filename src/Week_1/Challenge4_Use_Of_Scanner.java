package Week_1;

import java.util.Scanner;

public class Challenge4_Use_Of_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
