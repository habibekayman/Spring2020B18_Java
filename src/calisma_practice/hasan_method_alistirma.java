package calisma_practice;
import java.util.*;
public class hasan_method_alistirma {
    public static void main(String[] args) {
        int[] arr1 = {1,10, 9,8,14,15};
        int[] arr2 = {200, 100, 150, 500, 400};
        int[] arr3 = {1000, 800, 5000, 3000 };

        Arrays.sort(arr1); // {1,8,9,10,14,15}    oyle bir kod yazalim ki bize newarr1[] = {15,14,10,9,8,1} seklinde olsun
        int [] newarr1 = new int[arr1.length];
        int indnum1 = arr1.length-1; //indnum degiskeninin baslangic degeri (inital value) 5
        for(int a = 0; a<arr1.length; a++) {
            newarr1[a] = arr1[indnum1];
            indnum1--;

            // newarr1 [0] = arr1 [5];
            // newarr1 [1] = arr1 [4];
            // newarr1 [2] = arr1 [3];
            // newarr1 [3] = arr1 [2];
            // newarr1 [4] = arr1 [1];
            // newarr1 [5] = arr1 [0];

            Arrays.sort(arr2);
            int[] newarr2 = new int[arr2.length];
            int indnum2 = arr1.length - 1; //indnum degiskeninin baslangic degeri (inital value) 5
            for (int b = 0; b < arr2.length; b++) {
                newarr2[b] = arr2[indnum2];
                indnum2--;

                Arrays.sort(arr3);
                int[] newarr3 = new int[arr3.length];
                int indnum3 = arr3.length - 1; //indnum degiskeninin baslangic degeri (inital value) 5
                for (int c = 0; c < arr1.length; c++) {
                    newarr3[c] = arr3[indnum3];
                    indnum3--;


                }
            }


        }
    }
}



