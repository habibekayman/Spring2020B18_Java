package calisma_practice;

public class for_dongusu {
    public static void main(String[] args) {
           /* for (int i = 10; i > 0; --i) { //kosul bu
            //int i=10;
           // i=i++;
            //System.out.println(i);
              //if(i==10){
                System.out.println(i+5); // yapacagi sey bu

                Thread.sleep(1000);
            }
        }*/
         /*  String str =" ";
           str.trim();
           boolean A= str.isEmpty();
            System.out.println(A);
            */
   /* int z =5;
    for (int i=5; i>0; i--){
        z+=i;
        if(z>19){
            break;
        }
    }
*/
   /* int x , y;
    for (x=1; x<=5; x++){
        for (y=1; y<=x; y++)
            System.out.print(y + " ");
            System.out.println();
        }*/
        for(char z = 'a'; z <='z';z++) {   // NESTED LOOP
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        for(char z = 'z'; z <='a';z++) {   // NESTED LOOP
            for (char ch = 'a'; ch <= z; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }


}
