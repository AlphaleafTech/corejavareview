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
}//end::class
