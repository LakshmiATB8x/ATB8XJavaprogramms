package Lab017_StaticDocument;

public class Staticexample {

    public static void main(String[] args)
    {
         Student s1=new Student(18);
        System.out.println(Student.schoolname);
        System.out.println(s1.age);
        s1.learn();

    }

}

//A static variable is one that retains its value for the entire lifetime of the program instead of being re-created each time a function is called

class Student
{
   int age;
   static String schoolname="Sai krupa"; //static variable

    Student(int age)

    {
        this.age=age;
        System.out.println(age);
    }

    void learn()
    {
        System.out.println("learning java");
    }





}
