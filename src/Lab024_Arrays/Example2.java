package Lab024_Arrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args)
    {
        int[] marks ={92,88,100,83,98};
        System.out.println(marks[0]);
        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }



    }
}
