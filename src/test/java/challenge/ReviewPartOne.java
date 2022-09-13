package challenge;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static stayaway.utils.Data.*;


/**
 *
 */
public class ReviewPartOne {

    @Test
    public void echo() {
        // code here
        System.out.print("Row, row, row your boat");
        System.out.print("\n\n");
        System.out.print("Gently down the stream!!!");
    }


    @Test
    public void neon() {
       String out = "**        ***    **********      **             *             **\n" +
               "**      ***      **        **     **           ***           **\n" +
               "**    ***        **         **     **         ** **         **\n" +
               "**  ***          **          **     **       **   **       **\n" +
               "*****            **          **      **     **     **     **\n" +
               "**  ***          **          **       **   **       **   **\n" +
               "**    ***        **         **         ** **         ** **\n" +
               "**      ***      **        **           ***           ***\n" +
               "**        ***    **********              *             *";

        System.out.println(out);
    }


    @Test
    public void fillTheDataType() {

        int age = 29;
        double score = 8.99;
        char grade = 'A';
        boolean isActive = false;
        String message = "Hello World";

        System.out.println(age);
        System.out.println(score);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(message);

    }

    @Test
    public void createVariables() {
       String fullName = "Albert Einstein";
       int birthYear = 1879;
       String username = "einAlbert";
       String password = "physics4ever!";
       boolean online = false;
       int followers = 1_664_531;
       double iqScore = 159.86;

        System.out.println(fullName);
        System.out.println(birthYear);
        System.out.println(username);
        System.out.println(password);
        System.out.println(online);
        System.out.println(followers);
        System.out.println(iqScore);
    }

    @Test
    public void conversion() {
        // Biggest --> middle --> samllest
        //  double --> int   ---> char +- 64,000
        //  char  ---> int  ----> double

        // storage     source
        char num = (char)49873.023;

        double balance = 9234.78;
        int symbol = 36;

        int whole = (char)balance;
        char dollar = (char)symbol;

        System.out.println(dollar + " " + whole);
    }


    public void swap() {
        //                            [10,199]
        int a = number().numberBetween(10, 200); // 10 ~ 199
        int x = number().numberBetween(10, 200);

        System.out.println("Before swap");
        System.out.println("-------------");
        System.out.println("a = " + a);
        System.out.println("x = " + x);

        //---Your variable swapping code here--
        int temp = a;  // temp
        a = x;
        x = temp;

        //----------end of your code-----------

        System.out.println("\nAfter swap");
        System.out.println("-------------");
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }


    @Test
    public void basicCalculations() {
        int a = number().numberBetween(10, 99); // 10 - 98
        int b = number().numberBetween(5, 45);  // 5 - 44

        // your code here
        System.out.println("===OUTPUT===");
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (double)(a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }

    @Test
    public void printBigger() {
        int a = number().numberBetween(10, 99); // 10 - 98
        int b = number().numberBetween(10, 99); // 10 - 98

        // your code here
        // filter
        if(a < b) System.out.println("b is bigger");
        if(a > b) System.out.println("a is bigger");

        String out = (a < b)? "b is bigger" : "a is bigger";
        System.out.println(out);
    }


    @Test
    public void compareThreeNum() {
        int a = number().numberBetween(10, 99);
        int b = number().numberBetween(10, 99);
        int c = number().numberBetween(10, 99);

        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);

        // your code here
        int bigger = (a > b)? a : b;
        int larger = (c > bigger)? c : bigger;

       // System.out.println("largest: "+  larger);
        System.out.println("\n");
        if(larger == a) System.out.println("a is bigger");
        if(larger == b) System.out.println("b is bigger");
        if(larger == c) System.out.println("c is bigger");


    }

    @Test
    public void averageOfThreeNumber() {
        double a = number().randomDouble(3, 10, 99);
        double b = number().randomDouble(3, 10, 99);
        double c = number().randomDouble(3, 10, 99);

        // your code here
        double sum = a + b + c;
        System.out.println(sum/3);
    }
}//end::class