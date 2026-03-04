package Lab04_SwitchConcept;

public class Example1 {
    public static void main(String[] args)
    {
        switch(-1)
        {
            case 1:
                System.out.println("Given value is positive");
                break;

            case -1:
                System.out.println("Given value is negative");
                //it go default also becuase here we havnt give break


            default:
                System.out.println("ignore vale");
        }
    }
}
