package Lab022_Wrapperclass;

public class Example1 {
    public static void main(String[] args) {
        // wrapper classes are special classes that "wrap" primitive data types (like int, char, double) into objects.
        // This allows primitives to be used where objects are required, such as in collections (ArrayList, HashMap) or with generics.
        //int → Integer
        //char → Character
        //double → Double
        //boolean → Boolean
    //when we convert int to Integer extra function we can do directly
        //before wrapper wecant do a.tostring ,,after use Integer few inbuilt functions added
       int a=10;
        Integer b=a;
        System.out.println(b);
        System.out.println(b.toString());


    }
}
