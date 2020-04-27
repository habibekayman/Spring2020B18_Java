package repl.it;
import java.util.Scanner; //scanner objesi yapmak icin gerekli
public class shoppingList {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//scanner objesi yapmak icin gerekli
        String item1, item2, item3, report;
        int count1, count2, count3;
        double price1, price2, price3, totalPrice;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.nextLine();  //birinci urunun degeri string formatinda kullanici tarafindan girilmeli
        count1 = scan.nextInt();  //birinci urunun miktari int formatinda kullanici tarafindan girilmeli
        price1 = scan.nextDouble();  //birinci fiyat degeri double formatinda kullanici tarafindan girilmeli
        scan.nextLine();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.nextLine();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.nextLine();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();
        scan.nextLine();

        totalPrice = count1*price1+count2*price2+count3*price3;

        report="";
        if(count1>0){
            report = "Item1: "+item1+" Price: "+price1*count1;
        }
        if(count2>0){
            report += ", Item2: "+item2+" Price: "+price2*count2;
        }
        if(count3>0){
            report += ", Item3: "+item3+" Price: "+price3*count3;
        }



        System.out.println(report);
        System.out.println("Total price: "+totalPrice);



    }


}











       /* Scanner scan=new Scanner(System.in);
        String item1, item2, item3, report, exp1, exp2, exp3;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        if(count1>0){
            exp1="Item1: "+item1+" Price: "+price1+",";
        }
        else if (count1==0){
            exp1=null;
        }
        if(count2>0){
            exp2="Item2: "+item2+" Price: "+price2+",";
        }
        else if (count2==0){
            exp2=null;
        }
        if(count3>0){
            exp3="Item3: "+item3+" Price: "+price3;
        }
        else if (count3==0){
            exp3=null;
        }

     //   System.out.println(exp1+exp2+exp3);

        totalPrice= price1*count1+price2*count2+price3*count3;
        System.out.println("Total price: "+totalPrice);


    }
}
*/