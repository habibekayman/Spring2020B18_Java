package HasanExercises;

public class sample {
    public static void main(String[] args) {
        String answer;
        answer="d";
        if(answer=="a"){
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