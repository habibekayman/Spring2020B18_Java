package HasanExercises;

import jdk.nashorn.internal.ir.LexicalContext;
import jdk.nashorn.internal.ir.LexicalContextNode;

import java.util.Scanner;


public class X004_scanner_variable_precedence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Celcius=0;
        System.out.println("Enter temperature in Celcius");
        Celcius = input.nextDouble();
        double Fahrenheit = Celcius*9/5+32;
        System.out.println("Temperature is "+Fahrenheit+(char)8457);
        String feel = (Fahrenheit<60)?"Cold":(Fahrenheit>80)?"Hot":"Cool";
        System.out.println(feel);

    }
}
