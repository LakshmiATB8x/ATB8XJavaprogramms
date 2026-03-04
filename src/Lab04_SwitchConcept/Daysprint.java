package Lab04_SwitchConcept;

public class Daysprint {
    public static void main(String[] args)
    {

        //Switch condition
        //with the help of break we can stop the execution at matching point.
        //allowing you to execute different blocks of code based on the value of a single variable or expression.

        int day = 2;
        switch(day)
    {
        case 1:
            System.out.println("Today is monday");
            break;

        case 2:
            System.out.println("Today is Tuesday");
            break;
        case 3:
            System.out.println("Today is Wednesday");
            break;
        default:
            System.out.println("What day it is give proper number");
            break;



    }
    }
}
