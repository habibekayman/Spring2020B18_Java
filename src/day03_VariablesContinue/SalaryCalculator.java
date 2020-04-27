package day03_VariablesContinue;

public class SalaryCalculator {


        /*

        ex:
            if:
        rate= 55;
        stateTaxRate =0.22;
        federalTaxRate =0.22;
        weeklyhours =40;

        then output will be:
            your salary is ; 105600 USD
            your income after tax is : 78144 USD

                      */


    public static void main(String[] args) {
        //dataType varaibleName =Data ;

        double hourlyRate =50;
        double stateTaxRate =0.00;
        double federalTaxRate = 0.10;
        byte weeklyHours = 40;
        byte totalWeeks = 52;

        //salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks ;
                //salary before tax

        //stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        //federalTax = salary * stateTaxRate
        double federalTax = salary * federalTaxRate;

        //totalTax =statetax +federalTax
        double totalTax = stateTax +federalTax;

        //salaryAfterTax = salary -  stateTax - federalTax  ;
        double salaryAfterTax = salary - ( stateTax + federalTax ) ;

        System.out.println("Your salary is: $ " + salary ); //concatenation
        System.out.println("State tax is: $ " + stateTax); //concatenation
        System.out.println("Federal tax is: $ " + federalTax);
        System.out.println("Total tax is: & " + totalTax );
        System.out.println("salary After Tax is: $" + salaryAfterTax);



        /*
        System.out.println("9" + 3 ); // 93, concatenation
        System.out.println(9 +"3" ); // 93, concatenation
        System.out.println( 9 +3 ); // 12; addition

         */




    }
}
