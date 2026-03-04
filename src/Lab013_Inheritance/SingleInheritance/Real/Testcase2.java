package Lab013_Inheritance.SingleInheritance.Real;

public class Testcase2 extends MainCase {

    void Scenario2()
    {

        System.out.println("Enterpsaawor");
    }

    public static void main(String[] args)
    {
      Testcase2 secscenario=new Testcase2();
      secscenario.startbrowser();

      secscenario.Scenario2();
      secscenario.Closebrowser();

    }




}
