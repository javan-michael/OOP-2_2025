package Challenges;
import java.util.Scanner;
class HelloUntilStop {
    Scanner sc=new Scanner(System.in);
    String choice;
    void showHello(){


        System.out.println("Enter the letter 'h' to output 'hello '");
        choice=sc.next();

        while ("h".equals(choice)){
            System.out.println("Hello there");
        }
        choice=sc.next();
    }

}