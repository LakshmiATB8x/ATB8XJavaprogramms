package Lab020_StringBuffer;

public class Example1 {
    public static void main(String[] args)
    {
       String name="Lakshmi";
       //StringBuffer allows modifications such as appending, inserting, deleting, or replacing characters without creating new objects.
        // It is also thread-safe, making it suitable for multi-threaded environments.

    StringBuffer SB=new StringBuffer("Lakshmi");
    SB.append("Devi");
        System.out.println(SB);
        SB.append(9);
        System.out.println(SB);
        System.out.println(SB.reverse());


    }
}
