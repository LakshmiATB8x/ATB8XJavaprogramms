package Lab014_Polymorphism.Methodoverloading;

public class Math_Operation {

    //same method but different arguements and difeerent return types

    void add(int a ,int  b)
    {
        System.out.println(a+b);
    }



    int add(int a,int b,int c)
    {
        System.out.println(a+b+c);
        return a;
    }
     String add(String name , String surname)
     {
         System.out.println(surname+name);
         return surname;
     }





}
