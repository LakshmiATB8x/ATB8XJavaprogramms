package Lab013_Inheritance.HASA_Relationship;

public class Car {

    void startcar()
    {
        System.out.println("Use car key");
     new Engine().engine();
     new Tyre().tyre();

    }

    public static void main(String[] args)
    {
        Car c=new Car();
        c.startcar();
    }

}
