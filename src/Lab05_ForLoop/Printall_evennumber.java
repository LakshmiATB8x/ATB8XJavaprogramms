package Lab05_ForLoop;

public class Printall_evennumber {
    public static void main(String[] args)
    {
        for(int i=1; i<=30;i++)
        {
            if(i % 2 ==0)
            {
                System.out.println(i +"Number is even");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
