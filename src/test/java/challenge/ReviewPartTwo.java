package challenge;

import org.testng.annotations.Test;

import java.util.Arrays;

import static stayaway.utils.Data.*;


public class ReviewPartTwo {

    @Test
    public void gradePoint() {
        int point = number().numberBetween(-10, 101);
        System.out.println("Random points: " + point);

        // your code here
        String grade = "";

        if (point < 0) grade = "impossible!";
        else if (point >= 0 && point <= 49) grade = "failed";
        else if (point >= 50 && point <= 59) grade = "1";
        else if (point >= 60 && point <= 69) grade = "2";
        else if (point >= 70 && point <= 79) grade = "3";
        else if (point >= 80 && point <= 89) grade = "4";
        else if (point >= 90 && point <= 100) grade = "5";
        else grade = "incredible!";

        System.out.println(grade);
    }

    @Test
    public void counting() {
        int a = number().numberBetween(10, 35);  // 10 - 34
        System.out.println("Generated number: " + a);

        // your code here
        for(int i = 0; i <= a; i++)
            System.out.println(i);
    }

    @Test
    public void randomStop() {
        int a = number().numberBetween(1, 50);  // 1 ~ 49
        System.out.println("Stop at: " + a);

        System.out.println("printing up to 50");
        System.out.println("-----------------");

        // your code here
        for(int i = 1; i <= 50; i++) {
            System.out.println(i);
            if(i == a) break;
        }
    }

    @Test
    public void randomSkip() {
        int a = number().numberBetween(1, 20); // 1 ~ 19
        int b = number().numberBetween(1, 20); // 1 ~ 19
        System.out.println("Should skip at: " + a + " and " + b);

        System.out.println("printing up to 20");
        System.out.println("-----------------");

        // your code here
        for (int i = 0; i <= 20; i++) {
            if(i == a || i == b) {
                System.out.println("Skipping!");
                continue;
            }
            System.out.println(i);
        }

    }

    @Test
    public void countDown() {
        int a = number().numberBetween(10, 21);

        System.out.println("Counting down from: " + a);
        System.out.println("----------------------");

        // your code here
        int i = a;
        while( i >= 0 ) {
            System.out.println(i);
            i--;
        }
    }


    @Test
    public void fixArrayCode() {
        // fix the code
        //                   1         2         3        4         5
        //    index          0         1         2        3         4
        String[] fruits = {"apple", "orange", "grape", "tomato", "melon"};
        int idx = fruits.length - 1;
        String extracted = fruits[idx];
        System.out.println("Fetched Item: " + extracted);
    }


    @Test
    public void sumOfArray() {
        int[] scores = randomArr();
        System.out.println("scores: " + Arrays.toString(scores));

        // your code here
        int startIdx = 0;
        int lastIdx = scores.length -1;

        int sum = 0;
        for(int i = startIdx; i <= lastIdx; i++) {
            int each = scores[i];
            sum += each;
        }

        System.out.println("Sum :" + sum);
    }

}//end::class