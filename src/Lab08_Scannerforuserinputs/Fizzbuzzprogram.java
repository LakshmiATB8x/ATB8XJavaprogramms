package Lab08_Scannerforuserinputs;

public class Fizzbuzzprogram {

    public static void main(String[] args)
    {
        //Fizzbuss problem
        //write a program that print number 1to 100
        //and for multiples of 3 print as fizz,
        //for multiple of 5 print buss
        //for multiple of 3 and z print as buzz


        for(int i = 0; i<=100; i++)
        {
            if(i %3 == 0 && i % 5==0)
            {
                System.out.println("FIZZBUZZ");
            }

            else if(i % 3 == 0)
            {
              System.out.println("This number is multiples of 3fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("5multiplesbuss");

            }
            else if(i % 7 == 0)
            {
                System.out.println("7mutliplespinky");
            }
            else
            {
             System.out.println(i);
            }

        }
    }
}
