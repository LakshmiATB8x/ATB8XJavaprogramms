package Lab012_Constructor;

public class Usinghumanclass {

    public static void main(String[] args)
    {
        Human Firstperson = new Human("Lakshmi");
        Human Secondperson= new Human("God");
        new Human(10);
        System.out.println(Firstperson.name);
        System.out.println(Secondperson.name);
    }
}
