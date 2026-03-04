package Lab04_SwitchConcept;

public class Findvowels_Constants {
    public static void main(String[] args)
    {
        char A='c';
        switch('A')
        {
            case 'a' ,'i', 'e' ,'o' ,'u':
            System.out.println("given char is vowel");
            break;

            default:
                System.out.println("Given char is constant");
        }



    }
}
