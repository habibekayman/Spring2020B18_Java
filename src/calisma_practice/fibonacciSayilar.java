package calisma_practice;
import java.util.*;
public class fibonacciSayilar {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21 34 55 89
        Scanner s = new Scanner(System.in);
        System.out.println("How many terms do you need to display?");
        int term = s.nextInt();
        int previous = 1, current = 1, next;
        for (int i = 1; i < term; i++)
        {
            System.out.print(previous + " ");
            next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println(previous);

    }
}
