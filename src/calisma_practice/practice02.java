package calisma_practice;
import java.util.Scanner;
public class practice02 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //7-8-9-10-11-12 numarali satirlar yerinde 14uncu satiri yazabiliriz.
        // String[] arr = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //java kullaniciya deger girmesini istiyor ve dizimiz olusuyor
        //arr[i]={"habibe", "nesibe", "hasan", "kayman", "cakmakci"}

        for (int j=0; j<5; j++){
        System.out.println(arr[j].substring(0,1)+arr[j].substring(arr[j].length()-1));



 /*
        16 ve 17 numarali satir asagidaki 5 satir koda denk geliyor.
        System.out.println(arr[0].substring(0,3));
        System.out.println(arr[1].substring(0,3));
        System.out.println(arr[2].substring(0,3));
        System.out.println(arr[3].substring(0,3));
        System.out.println(arr[4].substring(0,3));
   */ }
}
}
