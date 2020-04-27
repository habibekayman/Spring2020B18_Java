package day20_ArrayContinue;
import java.util.Scanner;

public class Months {

    public static void main(String[] args) {
/*
        int[] n = new int[3];
        //benim integer (kusuratsiz sayi) formatinda n isimli bir degiskenim var bunun dizgisinin 3 elemani var
        n[0] = 0; // n dizisinin 0(index number) numarali elemani 0
        n[1] = 1 ; // n dizisinin 1(index number) numarali elamani 1
        n[2] =2; // n dizisinin 2(index number) numarali elemani 2
        //     n[3] = 3;
*/

        String[] months ={"Jan" , "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"}; // size: 12,  : 11
        // index numbers    0       1      2      3      4      5
   // kullanicinin girisi   1       2      3      4      5      6
        /*
        String[] months2 = new String[12];
                months2[0] = "Jan";
               ...
         */
        Scanner input = new Scanner(System.in); // Scanner nesnesini olusturduk

        System.out.println("Enter the number of month you were born"); // soru sorduk

        int num = input.nextInt(); // kullanici sayiyi girdi

        int attepmts = 1; // integer (kusuratsiz sayi) formatinda attemps isimli baslangic degeri 1 olan degiskenim

        // while dongusu basliyor
        while(num > 12 || num <= 0){ // kullanicinin girdigi sayi 12den buyuk olursa veya 0 ve sifirdan kucuk oldugunda
                                     // parantez icindeki asagidaki islemleri yap.
            System.out.println("Invalid Entry"); // gecersiz bilgi ciktisi
            System.out.println("Please re-enter the number"); // lutfen tekrar giriniz
            num = input.nextInt();  // bir ust satirda tekrar giriniz dedigi icin kullanici tekrar sayi girer
            attepmts++; // deneme sayisi bir artar. yani birinci deneme yanlis oldugu icin ikinci deneme yapacak

            if(attepmts == 3 &&  (num > 12 || num <= 0) ){ // eger ucuncu kez deneyip 12den buyuk sayi girerse veya
                                                            // sifir veya sifirdan kucuk rakam girerse
                System.out.println("Invalid Entry, you already have 3 attepmts"); // 3 kere yanlis girdiniz manasinda
                                                                                    // uyari verir
                System.exit(0);  // programi (kodu) bitir (durdur)
            }

        }



        String result =  months[num-1];  // result isimli string (metin) formatinda degiskenimin degeri
                                         // yukaridaki aylar dizisinin nesnelerinden olacak. Hangisi?
                                         // kullanicinin girdigi rakamdan bir eksigi. neden? index number sifirdan
                                         // baslar. mesela kullanici 12 sayisini girdiginde bundan 1 cikardigimizda
                                         // 11 numarali (index numarasi) nesneyi bulur o da bizim ornegimizde Dec dir.
                                         // kullanici 1 diye girer ama Jan (Ocak) 0 numarali (index) nesneyi gosterir.

        System.out.println(result); // yukarida tespit ettigimiz result degiskeninin degerinin ciktisini verir.




    }

}