package Lab010_NORETURN_NOARGu;

public class Fourtypesoffunctions {
    public static void main(String[] args)
    {
        greet();

        wishme();
        String somewish=wishme();
        System.out.println(somewish);

     yourname("srirama");

       int valueofage= Age(27);
        System.out.println(valueofage);


    }



    //No returntyp - No arguement
    public static void greet()
    {
        System.out.println("Hi fend ");

    }
    //Yes returntype -No arguement

    public static String wishme()
    {
        System.out.println("Happy new year");
        return "Wishing";
    }
    //No returntye - Yes Arguement
    public static void yourname(String name)
    {
        System.out.println("My name is" +name);


    }

    //Yesretuentyepe_yes arguement

    public static int Age(int value)
    {
        System.out.println("My age is" + value);

        return value;



    }

}
