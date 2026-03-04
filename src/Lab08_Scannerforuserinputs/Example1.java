package Lab08_Scannerforuserinputs;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

     System.out.println("Enter your name:--");
     String name=sc.next();
     System.out.println(name);
     System.out.println("Enter again number");
     sc.nextInt();



    }
}
