package stayaway.utils;

import net.datafaker.Faker;
import net.datafaker.Number;

public class Data {
    static
    public Faker get() {
        Faker faker = new Faker();
        return faker;
    }


    static
    public Number number() {
        Faker faker = new Faker();
        return faker.number();
    }

    static
    public int[] randomArr() {
        int[] arr = new int[10];
        for(
                int i = 0;
                i < arr.length;
                i++
        ){
            arr[i] = number().numberBetween(10,200);
        }
        return arr;
    }

}//end::class
