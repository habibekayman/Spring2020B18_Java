package repl.it;
import java.util.Scanner;
public class StringSample {
    public static void main(String [] args) {
        /*int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer){
            if(nbooksPurchased>=5 && nbooksPurchased<8){
                freeBooks += 1;
            }
            else if(nbooksPurchased>=8){
                freeBooks += 2;
            }
        }
        else if (!isPremiumCustomer){
            if(nbooksPurchased>=7 && nbooksPurchased<12){
                freeBooks +=1;
            }
            else if (nbooksPurchased>=12){
                freeBooks += 2;
            }
        }
        System.out.println(freeBooks);
        */

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println( "Do you have a US driver license?");
        String dlicense = scan.next();
        if(dlicense.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        if(zipcode == 20910 || zipcode ==20740 ){
            premium += 60;
        }
        else if(zipcode == 22102 || zipcode ==22103 ){
            premium += 30;
        }
        else {
            premium += 50;
        }

        System.out.println( "Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium += 10;
        }
        else{
            premium +=20;
        }

        System.out.println( "How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+= 50;
        }
        else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium+=10;
        }
        else if(vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
            System.out.println( "Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium = premium+(daysDrivenToWorkOrSchool*5);
            System.out.println( "Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium = premium+(milesToWorkOrSchool*1);
        }

        System.out.println( "How old are you?");
        int age = scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else if(age>=16 && age<18){
            premium*= 20;
        }
        else if(age>=18 && age<=21){
            premium*=6;
        }
        else if(age>21 && age<25){
            premium*=2;
        }

        System.out.println("How many years you've been driving?");
        int drivingExperience = scan.nextInt();
        if(drivingExperience==0 || (age - drivingExperience)<=16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else {
            premium = premium-drivingExperience*5;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();

        if( accident.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            do{
                premium = premium + (premium*20/100);
                accidentsAmount--;}
            while(accidentsAmount>0);
        }

        System.out.println( "Have you had continuous insurance for the past 12 months?");
        continuousInsurance =scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")){
            premium = premium*2;
        }

        System.out.println("What is the highest level of education you have completed?");
        education= scan.next();
        if(education=="PhD" || education=="Bachelor" || education== "Masters"){
            premium= premium-(premium*5/100);
        }
        if(education=="Doctors"){
            premium= premium-(premium*10/100);
        }
        if(education=="Less than High School"){
            premium= premium+(premium*5/100);
        }

        System.out.println( name+ ", here's your quote!");
        System.out.println( "Start Your Policy Today For: $"+premium);

        referenceNumber=(name.substring(0,2)+age +name.substring(name.length()-2,name.length())+zipcode+education).toUpperCase();

        System.out.println( "Reference number: "+ referenceNumber);




    }

}


