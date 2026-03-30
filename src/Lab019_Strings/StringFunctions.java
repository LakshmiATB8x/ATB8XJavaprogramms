package Lab019_Strings;

public class StringFunctions {
    public static void main(String[] args) {
        String str= " Hello world ";

        //to calcualte lenghth
        System.out.println(str.length());
       //to remove space use trim
        System.out.println(str.trim());

        // to get somespecifi lenghth from word

        System.out.println(str.substring(0 ,3));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //to get specific letter from word
        System.out.println(str.charAt(3));
        //to find on which index position specoific letter is present
        System.out.println(str.indexOf("l"));

    }
}
