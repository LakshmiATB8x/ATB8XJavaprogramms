package Lab06_Whileloop;

public class Example2print5_evennumber {

    public static void main(String[] args)
    {
        int count = 0;
        int number =2;

        while(count< 5)
        {
            if(number%2 ==0)
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
