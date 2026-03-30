package Lab019_Strings;

public class Stringequals {


    public static void main(String[] args) {
        String s1="Lakshmi";// this s1 is present in string constant pool area
        String s2=new String("Lakshmi");//this s2 is create onject and stored in heap area
        System.out.println(s1==s2);// result false ,because == operator checks location of the variable if location is same then only it will true
        String s3="Lakshmi";

        System.out.println(s1==s3);//true beacuse both are in same location At String constant pool area

        //how can i check the values:

        //we have predefinemethonds
        System.out.println(s1.equals(s2));//here it check values are same or not
        System.out.println(s2.equals(s3));



    }
}
