package Lab010_NORETURN_NOARGu;

import java.sql.SQLOutput;

public class Noreturntypenoarguement {

    public static void main(String[] args)
    {

        for(int i=0; i<=10;i++)
        {
            greet();
            i++;
        }

    }
    // void represent no need to return
    //in the greet(),nothing we write in brackets so there is no arguement
    //No Return type ,no arguement
    public static void greet()
    {
        System.out.println("Hi all,let meet today");

        System.out.println("hi all even numbers");
        System.out.println("Even and odd numbers");
        System.out.println("Lakshmi");


    }

}
