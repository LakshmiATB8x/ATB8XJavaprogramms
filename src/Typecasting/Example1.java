package Typecasting;

public class Example1 {
    public static void main(String[] args){

        /*type casting is two type
        1.Widening typoe casting(No data loss ,becuase storing values from small to large data type

        2.Narroing type casting (Get Data loss,because Changing large data type to small data type forcefully
         */
        byte a =20;
        int  b=(int) a; //  Widening typecasting(Byte data type is smaller than int)
        int result =a+b;
        System.out.println(b);

        int number=300000000;
        byte c= (byte)number;//narrowing ,forcefully large data storing into small data type
        System.out.println(c);//so data will loss




    }
}
