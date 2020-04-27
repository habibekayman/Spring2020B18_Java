package calisma_practice;
import java.util.Arrays;
import java.util.Scanner;
public class arrayin_elemanlarindan_yeni_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
/*        String [] harfler = new String[words.length];


        //TODO: Write your code below
        for(int i=0; i<words.length;i++){
            harfler [i] = words[i].substring(0,1)+words[i].substring(words[i].length()-1);
        }


        System.out.println(Arrays.toString(harfler));
*/
        System.out.println(Arrays.toString(words));

    }
}
