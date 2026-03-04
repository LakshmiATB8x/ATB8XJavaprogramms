package Lab015_Encapsulation.Accessmodifier.Police;

public class Lakshmi {

    public int guns;

    public Lakshmi(int guns)
    {
        this.guns=guns;
    }

    public void getguns()
    {
        System.out.println(guns);

    }



    //if we use protected ,data members can access inside the package only

   protected void shoot()
    {
        System.out.println("You can shoot");
    }



}
