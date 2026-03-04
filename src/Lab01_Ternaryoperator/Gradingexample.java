package Lab01_Ternaryoperator;

public class Gradingexample {
    public static void main(String[] args){
        /*if student get more than 90 -it has to print A
        if student get less than 90 -It has to print B
        90>=A
        80>=B
        70>7=C
        less than that it has to pront fail
         */

        int student = 65;
        //System.out.println(student>=90?"GradeA":(student<=90 && student>=80)?"Gradeb");
        System.out.println(student>=90?"GardseA":(student<=90 && student>=80)?"GradeB":(student<=80 && student>=70?"Gardec":"GradeD"));
    }
}
