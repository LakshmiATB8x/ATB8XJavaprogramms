package Lab023_Exceptions_Error;

public class Exception3_ex {
    public static void main(String[] args) {

        try {
            String s1="Lakshmi";
            String a1=args[0];
            int a=10/0;
            s1=null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
