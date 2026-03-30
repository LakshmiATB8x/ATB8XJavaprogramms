package Lab023_Exceptions_Error;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Uncheckedexamples {
    public static void main(String[] args) throws FileNotFoundException {

        //unchecked will run time only jvm will know
        try {
            int a=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("It is unchecked before run jvm cant get to know");
        }

        //checked before run jvm willknow
        try {
            FileReader  f=new FileReader("c://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}
