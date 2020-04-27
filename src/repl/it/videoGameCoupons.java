package repl.it;
import java.util.*;
public class videoGameCoupons {
    public static void main(StringSample[] args) {
        System.out.println("Enter number of coupons:");
        Scanner input = new Scanner(System.in);
        int coupon = input.nextInt();
        if (coupon >= 3) {

            System.out.println("Number of Candies: " + (coupon / 10));
            System.out.println("Number of Gumballs: " + (coupon % 10) / 3);
        }

        else{
            System.out.println("Not enough coupons");
        }
    }
}
