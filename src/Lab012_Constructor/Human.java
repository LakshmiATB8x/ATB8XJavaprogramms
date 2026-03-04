package Lab012_Constructor;

public class Human {

//    //Constructor is a speacial method ,it is called automatically at the time of object created
//syntax: it has the same name of class name
//it has no return type
    //Main purpose of the constructor is to intialise the instance variable values

//defaultconstructor
    Human()
    {

        System.out.println("I will be called automatically when obj is created");
    }
    //parametrised constructor
    Human(String name)
    {
        System.out.println("I will print when parametrised consturctor created"+name);
        this.name=name;
    }
    Human(int age)
    {
        System.out.println("my age is"+age);
    }



    int age=20;
     String eyecolour;
    String name;
    String planet="Earth";
    String colour;
    String City;
    int height;

    void walk() {}

    String teach()
    {
        return "I can teach for one month";
    }

    void eat(String fooditem)
    {
        System.out.println(fooditem);
    }






}
