package Lab04_SwitchConcept;

public class BrowserChoosing {
    public static void main(String[] args)
    {
        //For web automation
        //I will ask user Which browser you want to run the code

        String Browser="Firefox";
        switch(Browser)
        {
            case "Chrome":
                System.out.println("Tester want to execute code on Chrome");
                break;

            case "Firefox":
                System.out.println("Tester want to execute code on Firefox");
                break;


            default:
                System.out.println("No browser we have to execute");
                break;



        }
    }
}
