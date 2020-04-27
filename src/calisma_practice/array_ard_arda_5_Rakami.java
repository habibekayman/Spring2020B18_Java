package calisma_practice;
import java.util.Scanner;
public class array_ard_arda_5_Rakami {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums [] = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
        for(int i=0; i<nums.length-1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                System.out.println("true");
                System.exit(0);
            }
        }
        System.out.println("false");
        }
    }


