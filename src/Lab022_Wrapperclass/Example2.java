package Lab022_Wrapperclass;

public class Example2 {

    public static void main(String[] args) {

        String a="10";
        //if we want to change string to integervalue ,,we use Integer
        //string to int
       int a1= Integer.valueOf(a);
        System.out.println(a1);

        Integer a2=a1;
        // with the help of below functons we can find data type

        System.out.println(a.getClass().getName());
        System.out.println(a2.getClass().getName());





    }
}
