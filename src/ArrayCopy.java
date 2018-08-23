import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int[] ar = new int[4];
        System.out.println("Fill Array");
        for (int i = 0; i < ar.length; i++){
            ar[i] = scr.nextInt();
        }
        int ar1[], ar2[];
        ar1 = Arrays.copyOfRange(ar, 0,ar.length /2);
        ar2 = Arrays.copyOfRange(ar, ar.length /2, ar.length);

        String ar1s = Arrays.toString(ar1);
        String ar2s = Arrays.toString(ar2);
        System.out.println(ar1s);
        System.out.println(ar2s);



    }
}
