package Typecasting;

public class Example3 {
    public static void main(String[] args){
        float gst= 14.85f;
        int  Gol_values= 400;
        int result = (int)gst+Gol_values;//explicity narrowing
        System.out.println(result);

    }
}
