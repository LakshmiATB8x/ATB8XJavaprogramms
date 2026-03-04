package Lab015_Encapsulation.Gettersetter;

public class Student {
  //Keeping variables private inside a class.

    //Allowing access to them only through methods (getters and setters).
    private String name;
   private int age;

//paramerteised constructor
    Student(String name ,int age )
    {
        this.name=name;
        System.out.println(name);
    }
//Getter

    public void getname()
    {
        System.out.println(name);
    }
//setter
    public void setname(String name , int age)
    {
        this.name=name;
        this.age=age;
    }



}
