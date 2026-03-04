package Lab013_Inheritance.SingleInheritance.Real;

public class Testcase1 extends MainCase {

    void loginurl()
    {

        System.out.println("Afterbroseropen login to url");

    }

   public static void main(String[] args)
   {
       Testcase1 firstcase=new Testcase1();
       firstcase.startbrowser();
       firstcase.loginurl();
       firstcase.Closebrowser();
   }

}
