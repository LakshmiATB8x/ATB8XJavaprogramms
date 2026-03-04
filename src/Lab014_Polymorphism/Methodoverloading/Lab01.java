package Lab014_Polymorphism.Methodoverloading;

public class Lab01 {
    public static void main(String[] args)
    {
       Math_Operation math=new Math_Operation();
        System.out.println(math.add(2,3,4));

       String sur= math.add("Lakshmi","Yandra");
        System.out.println(sur);

    }
}
