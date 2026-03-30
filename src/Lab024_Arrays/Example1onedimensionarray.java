package Lab024_Arrays;

public class Example1onedimensionarray {
    public static void main(String[] args){



        int[] marks ={90 ,92,94, 96 ,98};
        System.out.println(marks.length);
        System.out.println(marks[0]);

        //second way in below first we are fixing array lenght

        int[]  marks2=new int[6];
        marks2[0]=89;
        marks2[1]=93;

        System.out.println(marks2.length);
        System.out.println(marks2[1]);
    }
}
