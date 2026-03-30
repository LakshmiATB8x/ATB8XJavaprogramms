package Lab023_Exceptions_Error;

public class Exception1_handle {
    public static void main(String[] args)
    {
        int a=0;
        try {
            int c= 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("i always execute");
        }
    }
}
