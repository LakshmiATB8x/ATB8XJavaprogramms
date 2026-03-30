package Lab021_StringBuilder;

public class Example1 {
    public static void main(String[] args) {
        StringBuilder SB=new StringBuilder("Srirama");
        SB.append(10);
        System.out.println(SB);
        System.out.println(SB.insert(7,"jai"));
        System.out.println(SB.length());

    }
}
