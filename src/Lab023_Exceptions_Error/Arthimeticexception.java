package Lab023_Exceptions_Error;

public class Arthimeticexception {
    public static void main(String[] args) {
        int a=10;
        int c= a/0;

        System.out.println(c);//Arthimeticexception.java:6)
        System.out.println("End the program");
        //this is unchecked error,means jvm dont know before exceution so it cant handle before exceution
        //so it terminate the flow at the step of wrongcode
    }
}
