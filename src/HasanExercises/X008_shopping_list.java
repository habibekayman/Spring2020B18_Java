package HasanExercises;
import java.util.Scanner;

public class X008_shopping_list {
    public static void main(String[] args) {
 /*       Scanner scan = new Scanner (System.in);
        String item1, item2, item3, report="";
        int count1, count2, count3;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1, count and its price");
        item1 = scan.nextLine();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        scan.nextLine();
        boolean cnt1 = count1>0;

        System.out.println("Enter Item2, count and its price");
        item2 = scan.nextLine();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        scan.nextLine();
        boolean cnt2 = count2>0;

        System.out.println("Enter Item3, count and its price");
        item3 = scan.nextLine();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();
        scan.nextLine();
        boolean cnt3 = count3>0;

        totalPrice = count1*price1+count2*price2+count3*price3;

        if(cnt1){
            report = "Item1: "+item1+" Price: "+price1;
        }
        if(cnt2){
            report += ", Item2: "+item2+" Price: "+price2;
        }
        if(cnt3){
            report += ", Item3: "+item3+" Price: "+price3;
        }

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);



    }


}
*/
        Scanner scan = new Scanner (System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        totalPrice = price1+price2+price3;
        report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);


    }
}