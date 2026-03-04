package Lab03_Ifcondition;

import java.util.Scanner;

public class Trainagle_isoccleprogram {

    //if three side equal print as a trainagle
    //if two side equal pribt as isoscale
    //if no side equal print as a scalene

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please print ur first side length");
        int a= sc.nextInt();
        System.out.print("Please print ur second side lengt");

        int b= sc.nextInt();
        System.out.print("Please print ur Third side lenght");
        int c= sc.nextInt();
       if(a>0 && b>0 && c>0) {
           if (a == b && b == c && c == b) {
               System.out.println("You are searching for traingle");
           } else if (a == b || a == c || b == c) {
               System.out.println("You are searching for Isoscale");
           } else {
               System.out.println("SCalen");
           }

       }
       else
       {
           System.out.println("Please give positive value");
       }

    }

}
