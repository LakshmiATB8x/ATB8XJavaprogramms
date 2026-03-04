package Lab014_Polymorphism.Methodoverriding;

public class Son extends Father{
     @Override
    void house()
    {
        System.out.println("i have flat");
    }


    public static void main(String[] args)
    {

        Son s=new Son();
        s.house();
        s.field();
        Father f=new Father();
        f.house();
    }

}
