package challenge;

import org.testng.annotations.Test;
import java.util.Arrays;
import static stayaway.utils.Data.*;


public class ReviewPartTwo {


    public void gradePoint() {
        int point = number().numberBetween(-10, 101);

        // your code here

    }


    public void counting() {
        int a = number().numberBetween(10, 35);
        System.out.println("Generated number: " + a);

        // your code here

    }


    public void randomStop() {
        int a = number().numberBetween(1, 50);
        System.out.println("Stop at: " + a);

        System.out.println("printing up to 50");
        System.out.println("-----------------");

        // your code here
    }


    public void randomSkip() {
        int a = number().numberBetween(1, 20);
        int b = number().numberBetween(1, 20);
        System.out.println("Should skip at: " + a + " and " + b);

        System.out.println("printing up to 20");
        System.out.println("-----------------");

        // your code here

    }


    public void countDown() {
        int a = number().numberBetween(10, 21);

        System.out.println("Counting down from: " + a);
        System.out.println("----------------------");

        // your code here
    }


    public void fixArrayCode() {
        // fix the code
        //                   1         2         3        4         5
        String[] fruits = {"apple", "orange", "grape", "tomato", "melon"};
        int idx = 5;
        String extracted = fruits[idx];
        System.out.println("Fetched Item: " + extracted);
    }

    @Test
    public void sumOfArray() {
        int[] scores = randomArr();
        System.out.println("scores: " + Arrays.toString(scores));

        // your code here

    }

}//end::class
