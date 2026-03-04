package Lab012_Constructor;

import java.sql.SQLOutput;

public class Dog {

    String colour;
    int age;
    int legs;
    String eyecolour;
    int teeth;
    String name;

    //Prametroised constructor

    Dog(String name ,int age)
    {
        System.out.println("Petdog name is"+name);
        System.out.println("Petdaog sage is"+age);
        this.name=name;

        this.age=age;
    }

    void walk()
    {
        System.out.println("it can walk");
    };
    void Sound()
    {
        System.out.println("It can sound as bow bow");
    }
}
