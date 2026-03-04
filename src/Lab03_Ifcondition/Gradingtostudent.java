package Lab03_Ifcondition;

public class Gradingtostudent {
    public static void main(String[] args)
    {
        int std = 50;
        if(std >=90 && std <=100)
        {
            System.out.println("Student passed with Grade" + "A");
        }
        else if (std>=80 && std<=70)
        {
          System.out.println("Student passed with Grade" + "B");
        }
        else

        {
            System.out.println("Student is fail");
        }
    }
}
