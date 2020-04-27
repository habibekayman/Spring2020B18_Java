package repl.it;
import java.util.*;
public class SonHarfiSilme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.println(txt.substring(0,txt.length()-1));

        //asagidaki cozum uzun cozum.
       //for(int n=0; n<txt.length()-1; n++) {
       //   System.out.print(txt.charAt(n));
       // }

    }
}
