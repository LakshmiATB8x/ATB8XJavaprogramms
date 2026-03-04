package Lab013_Inheritance.SingleInheritance.Ex1;

public class Son extends Father {


    public static void main(String[] args)
    {

       Son S= new Son();
        System.out.println(S.cars);
        S.bhk2();




    }

    int Gold = 250;
    void BHK1()
    {
        System.out.println("1bhk");

        bhk2();
        System.out.println(Field);
    }

    //after extend father class i can get access on his properties



}
