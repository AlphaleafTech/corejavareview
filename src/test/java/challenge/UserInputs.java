package challenge;

import java.util.Locale;
import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Test Context Name: ");
        String testContext = scan.nextLine();

        System.out.print("Test Execution Env: ");
        String exeEnv = scan.nextLine();

        System.out.print("Total Testcase #: ");
        int totalNum = scan.nextInt();

        System.out.print("Desired Success Ratio: ");
        double successRatio = scan.nextDouble();
        scan.nextLine();

        System.out.print("Test Executed By: ");
        String name = scan.nextLine();

        System.out.println("\n\n=====OUTPUT=====");
        System.out.println("Scheduled Test : " + testContext.toUpperCase() );
        System.out.println("Execution Env  : " + exeEnv.toUpperCase() );
        System.out.println("Total Testcases: " + totalNum);
        System.out.println("Target Ratio(%): " + successRatio + "%") ;
        System.out.println("Test Started By: " + name.toLowerCase() );
        System.out.println("================");

        scan.close();
    }

}//end::class
