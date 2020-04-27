package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {

    public static void main(String[] args) {
        int[] arr1D = {1,2,3};

      //  System.out.println(Arrays.toString(arr1D));

        int[][] arr2D = {{1,2,3},{4,5,6}};//3 tane olusa yeni bilgi girmen gerek parentez icine 3 tane onerilmiyor.
//birden fazla [] [] varsa deep to string kullaniyoruz.

       // System.out.println(  Arrays.toString(arr2D));

        //System.out.println( Arrays.deepToString(arr2D));


        //                         0       1               0        1
        int[][][]  arr3D = {   {{1,2,3},{4,5,6}} ,     {{7,8,9},{10,11,12}}    };
        //                             0                          1

        System.out.println(  Arrays.deepToString( arr3D[1] )     );//

        System.out.println( Arrays.toString( arr3D[0][1]  )   );//arrayi string e donustur


        System.out.println(   arr3D[1][1][2]  );






    }


}