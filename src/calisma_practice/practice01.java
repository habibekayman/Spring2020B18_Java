package calisma_practice;

public class practice01 {
    public static void main(String[] args) {

    //if:
        //					rate = 55;
        //					stateTax = 0.04;
        //					federalTax =0.22;
        //					weeklyHours = 40;
        //				then output will be:
        //					your salary is: 105600 USD
        //					your total tax is: 27456 USD
        //					your income after tax is: 78144 USD

        //variables
        double rate = 55;
        double stateTax =0.04;
        double federalTax = 0.22;
        byte weeklyHour = 40;
        double salarybeforetax = rate * weeklyHour*48;
        double yearlyfederalTax = federalTax * salarybeforetax;
        double yearlystateTax = stateTax * salarybeforetax;
        double salaryaftertax = salarybeforetax - yearlystateTax - yearlyfederalTax;

        String x = " USD";

        System.out.println( "your salary is: "+ salarybeforetax +x );
        //System.out.println( "your salary is: "+ rate * weeklyHour *48 +x );
        //System.out.println(  "your total tax is: "+ (stateTax * rate * weeklyHour*48 + federalTax * rate * weeklyHour*48) + x);
        //System.out.println(  "your total tax is: "+ (stateTax * salarybeforetax + federalTax * salarybeforetax) + x);
        System.out.println(  "your total tax is: "+ (yearlystateTax + yearlyfederalTax) + x);
        System.out.println("your income after tax is: " + salaryaftertax +x);


        /*public static void main(String[] args) {
            int  x =  10;

            int  y =  ++x;

            System.out.println( y++  + "  " +  ++x  + "  " + y);
            System.out.println( y  + "  " +  x++  + "  " + y++ + " "+y); //10 11 12

         */



        }

}
