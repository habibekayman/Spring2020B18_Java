package day21_MultiDimensionalArrays;

/*
1. write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
                average: 10
 */

import java.text.DecimalFormat;

public class AverageNumber {

    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.0");// decimal number 10lu sayi sistemi demektir.
        // ornek 1374.21 sayisi decimal sisteme gore (1*10^3) + (3*10^2) + (7*10^1) + (4*10^0) + (2*10^-1) + (1*10^-2)

        double[] nums = {1, 2, 2};  //5, 10
        // average: sum of all numbers / length

        int len = nums.length; // total number of the elements

        double sum = 0; //0.0

        for(int i = 0; i < len; i++  ){
            double eachnum =  nums[i];
            sum +=  eachnum;
        }

        System.out.println(sum);

        double average = sum/len;
        System.out.println(average);
        System.out.println(DF.format(average) );
        /*

                [2,1,3] ==> 6
                [1,2,3] ==> 6

*/





 /*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );
        System.out.println( 5/(double)3);


*/






/* quiz
int [] num1 = new int [3];
int [] num2 = {1,2,3,4,5};
num1=num2;
        // num = {1,2,3,4,5} -1, 3, 2, -1
for(int i=0; i<num1.length;i++){
    System.out.print(num1[i]);
}*/
    }

    }

