package Lab017_StaticDocument;

public class Lab155 {

    public static void main(String[] args)
    {
        ATB S1=new ATB("Lakshmi");

        ATB S2=new ATB("Lai");

        ATB s3=new ATB("ramji");
        new ATB("jai");

        S1.readdoc();
    }


}

class ATB
{



    private String name;
    private String phone;
    static String Coursename="ATB";



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//A block of code inside a class without any method name, executed every time an object is created,
// before the constructor.
    {
        System.out.println("IIB");

    }
    //when you need common initialization for all constructors
    static
    {
        System.out.println("Iwill execute ,once class load");
    }
    //Parametrised constructor
    public ATB(String name)
    {
        this.name=name;
    }

    void readdoc()
    {
        System.out.println("Non static method");
    }

    static void doassigment()
    {
        System.out.println(Coursename);
        System.out.println("DO assignemt");
    }



}