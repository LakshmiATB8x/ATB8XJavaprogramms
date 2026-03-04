package Lab015_Encapsulation.Gettersetter;

public class Movieentry {

    private int age;


    Movieentry(int age )
    {
        this.age=age;
    }


    //set
    void setage(int age)
    {
        this.age=age;
    }

    //get
    void getage()
    {
        if(age>10)
        {
            System.out.println("Allow to atch devil movie");
        }

        else
        {
            System.out.println("Dont allow to watch a movie");
        }
    }

}
