package calisma_practice;
import java.util.Scanner;
public class practice04 {
   /* public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt(); // x degerini girmemizi istiyor. integer (kusuratsiz) olmali
        //WRITE YOUT CODE HERE
        System.out.println((x>=5)?x+" is bigger than 5":x+" is not bigger than 5") ;
       /* if(x>=5){
            System.out.println(x);
        }else{
            System.out.println(-x);
        }
        */
   /*public static void main(String[] args) {
       //WRITE YOUR CODE HERE:
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter 3 numbers:");
       int num1=scan.nextInt();
       int num2=scan.nextInt();
       int num3=scan.nextInt();
       int sum =num1+num2+num3;
       System.out.println("Sum of numbers: "+sum);
*/
 /*  public static void main (String[] args){
       Scanner habibe = new Scanner (System.in);
       int areaCode = habibe.nextInt();
       int localNumber = habibe.nextInt();
       String phoneNumber = "("+areaCode+")-"+localNumber;
       System.out.println(phoneNumber);


   }
}*/
   public static void main(String[] args) {


   /* Scanner svalue= new Scanner (System.in);
     System.out.println("Enter seconds:");
     int inputSeconds = svalue.nextInt();
    int hours = inputSeconds /3600;
    int minutes = (inputSeconds % 3600) / 60;
    int seconds = (inputSeconds % 3600) % 60;
    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+ " seconds");
*/
  /*     Scanner number = new Scanner (System.in);
       int caffdose = number.nextInt();
       int drinknum = (10 * 1000) / caffdose;
       System.out.println("It would take about "+ drinknum+" drinks for a lethal overdose." );


   }
}*/
   /*    Scanner money = new Scanner (System.in);
       System.out.println("Enter item price:");
       int itemPrice = money.nextInt();
       if( itemPrice>=25 && itemPrice<=100 && itemPrice%5==0){
           System.out.println("Your change is "+(100-itemPrice)/25+" quarters, "+((100-itemPrice)%25)/10+" dimes, and "+(((100-itemPrice)%25)%10)/5+" nickels.");
   }
       else{
           System.out.println("Invalid price!");

       }
*/
 /*      Scanner input = new Scanner (System.in);
       System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
       int seniorCitizens = input.nextInt();
       int nonSeniorCitizens = input.nextInt();
       System.out.println("What is new citizen's age?");
       int age = input.nextInt();
       if(age>=65){
           System.out.println("Senior Citizen");
           seniorCitizens = ++seniorCitizens;
       }
       else if (age<65){
           System.out.println("Non-Senior Citizen");
           nonSeniorCitizens = ++nonSeniorCitizens;
       }
       System.out.println("New seniorCitizens count "+ seniorCitizens);
       System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizens);
*/
 /*
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       System.out.println(number/10000);
       System.out.println((number%10000)/1000);
       System.out.println(((number%10000)%1000)/100);
       System.out.println((((number%10000)%1000)%100)/10);
       System.out.println((((number%10000)%1000)%100)%10);
  */
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter status code:");
       int status = scan.nextInt();
       //WRITE YOUR CODE HERE
       switch(status) {
           case (200):
               System.out.println("OK");
           case (201):
               System.out.println("Created");
           case (202):
               System.out.println("Accepted");
           case (301):
               System.out.println("Moved Permanently");
           case (303):
               System.out.println("See other");
           case (304):
               System.out.println("Not Modified");
           case (307):
               System.out.println("Temporary Redirect");
           case (400):
               System.out.println("Bad Request");
           case (401):
               System.out.println("Unauthorized");
           case (403):
               System.out.println("Forbidden");
           case (404):
               System.out.println("Not Found");
           case (410):
               System.out.println("Gone");
           case (500):
               System.out.println("Internal Server Error");
           case (503):
               System.out.println("Service Unavailable");
       }


   }
}