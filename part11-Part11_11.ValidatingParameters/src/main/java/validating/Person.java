package validating;

import javax.lang.model.type.NullType;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if(name == null || name.equals("") || name.length()>40 || age > 120 || age < 0) {
            throw new IllegalArgumentException("not correct");
            
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
