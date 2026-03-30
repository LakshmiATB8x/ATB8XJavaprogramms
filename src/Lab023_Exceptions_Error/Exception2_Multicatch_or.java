package Lab023_Exceptions_Error;

public class Exception2_Multicatch_or {
    public static void main(String[] args) {

        int a=0;
        try {
            int c= a/10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("iwill execute");
        }
        String ip= null;
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        int d =Integer.parseInt(ip);


    }
}
