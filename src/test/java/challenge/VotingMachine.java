package challenge;

import java.util.Scanner;

public class VotingMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        boolean young    = (age < 16);
        boolean must     = (age >= 17 && age <= 52);
        boolean optional = (age >= 53 && age <= 65);

        // Your code here
        if(young)         System.out.println("You are too young");
        else if(must)     System.out.println("You must vote");
        else if(optional) System.out.println("Optional");
        else              System.out.println("Too senior");

        scan.close();
    }
}
