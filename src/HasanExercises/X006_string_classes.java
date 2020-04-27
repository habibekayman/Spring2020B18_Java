package HasanExercises;
import java.util.*;
import java.lang.String;
public class X006_string_classes {
    public static void main(String[] args) {
       /* Scanner xyz = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = xyz.nextLine();
        System.out.println( text.charAt(5));
*/
/*
        String str="Cybertek";
        char  c1 = str.charAt(5); //t
        System.out.println(c1 == 'A'); //False
        int totallength = str.length();
        System.out.println(totallength);
        System.out.println(totallength>5); //true

        String str2 = "Today is great day, Java is Fun";
        int count2 = str2.length();
        System.out.println(count2);
        int maximumIndexNumber = count2-1;
        System.out.println(maximumIndexNumber);

        String s1 = "Habibe";
        System.out.println(s1.concat(" Kayman"));
        System.out.println(s1);
*/
        String myname ="Hasan";
        System.out.println(myname);
        myname = myname.concat(" Kayman"); // myname becomes "Hasan Kayman"
        System.out.println(myname); // prints out
        myname = myname.toLowerCase(); // myname turns into "hasan kayman"
        System.out.println(myname);
        myname = myname.toUpperCase(); // myname turns into "HASAN KAYMAN"
        System.out.println(myname);
        System.out.println(myname.length());
        String newtext = "         Habibe         ben           seni      cok       seviyorum                        ";
        System.out.println(newtext);
        System.out.println(newtext.length());
        newtext = newtext.trim();
        System.out.println(newtext);
        System.out.println(newtext.length());








    }




}
