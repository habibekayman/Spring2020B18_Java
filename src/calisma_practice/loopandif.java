package calisma_practice;
import java.util.*;
public class loopandif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        while (word.length()>0){
            System.out.println("Enter your word:");
            word = s.nextLine();
            if (word.startsWith("java")) {
                System.out.println("true");
            } else if (word.substring(2).contains("java")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }


}
