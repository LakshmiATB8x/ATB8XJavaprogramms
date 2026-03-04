package Lab017_StaticDocument;

public class Staticex2 {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();

    }

}

class A{
    {
//his runs every time you create a new object of class A.
//So each time you call new A(), it prints "Instance intialisevaraible".
        System.out.println("Instance intialisevaraible"); // this is instance intialiser block
    }

    static

    {

        //This runs once per class, when the class is first loaded into memory by the JVM.
        //        //So the message "Static varialble" will print only once, no matter how many objects you create.
        System.out.println("Static varialble");// this is Static block
    }

}



