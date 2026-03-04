package Lab015_Encapsulation.Super;

public class Animal {

    void sound()
    {
        System.out.println("Animals can eat grass");
    }
    void see()
    {
        System.out.println("Animals can see");
    }

}
//anoter class
class dog extends Animal
{
    void sound()
    {

        super.sound();
        this.see();
        System.out.println("Dog sounds like bow bow");
    }

    void see()
    {
        System.out.println("Dog can see");
    }

    public static void main(String[] args)
    {

      dog d=new dog();
      d.sound();
     Animal a=new Animal();
     a.see();

    }

}








