package repl.it;
import java.util.*;
public class words035 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your answer");
        String answer = s.nextLine();

        //your code here
        if(answer.equals("a")){
            System.out.println(answer+" is wrong");
        }
        else if(answer.equals("b")) {
            System.out.println(answer + " is correct");
        }
        else if(answer.equals("c")){
            System.out.println(answer+" is wrong");
        }
        else{
            System.out.println(answer+" is not a valid answer");
        }

    }
}