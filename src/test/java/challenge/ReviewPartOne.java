package challenge;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static stayaway.utils.Data.*;


/**
 *
 */
public class ReviewPartOne {


    public void echo() {
        // code here

    }


    public void neon() {
        // code here
    }


    public void fillTheDataType() {
        /*
        ? age = 29;
        ? score = 8.99;
        ? grade = 'A';
        ? isActive = false;
        ? message = "Hello World";

        System.out.println(age);
        System.out.println(score);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(message);
        */
    }


    public void createVariables() {
        // your code here
    }


    public void conversion() {
        /*
        double balance = 9234.78;
        int symbol = 36;

        int whole = balance;
        char dollar = symbol;

        System.out.println(dollar + " " + whole);
        */
    }


    public void swap() {
        int a = number().numberBetween(10, 200);
        int x = number().numberBetween(10, 200);

        System.out.println("Before swap");
        System.out.println("-------------");
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        //---Your variable swapping code here--


        //----------end of your code-----------

        System.out.println("\nAfter swap");
        System.out.println("-------------");
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }


    public void basicCalculations() {
        int a = number().numberBetween(10, 99);
        int b = number().numberBetween(5, 45);

        // your code here

    }


    public void printBigger() {
        int a = number().numberBetween(10, 99);
        int b = number().numberBetween(10, 99);

        // your code here

    }


    public void compareThreeNum() {
        int a = number().numberBetween(10, 99);
        int b = number().numberBetween(10, 99);
        int c = number().numberBetween(10, 99);

        // your code here

    }

    @Test
    public void averageOfThreeNumber() {
        double a = number().randomDouble(3, 10, 99);
        double b = number().randomDouble(3, 10, 99);
        double c = number().randomDouble(3, 10, 99);

        // your code here

    }
}//end::class