package Lab018_Enum;

public class Ex1forEnum {
    public static void main(String[] args) {
        System.out.println(Trafficlight.Green.Action);

    }
}

//It’s particularly useful when we  have a fixed set of values that a variable can take, such as days of the week, directions, or traffic light signals. Enums improve readability, type safety,
// and maintainability because they prevent invalid values from being assigned

enum Trafficlight{


    Red("Stop all vehicles"),Green("GO"),Yellow("Be ready");

    //parameterised constructor
    Trafficlight(String Action)
    {
       this.Action=Action;
    }

    String Action;


    public void getaction()
    {
        System.out.println(Action);
    }
}
