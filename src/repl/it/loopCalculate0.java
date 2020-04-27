package repl.it;
import java.util.Scanner;

public class loopCalculate0 {
    public static void main(StringSample[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum +=i;
            System.out.println(i);
        }

    }
}
   /* int num = input.nextInt(); // 100
    int sum = 0; //1+2+3+...100

         for(int i = 1; i <= num; i++){
                 sum += i;
                 }
                 System.out.println(sum);
                 }*/