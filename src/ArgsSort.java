import java.util.Arrays;
public class ArgsSort {
    public static void main(String args[]){
        String unsorted = Arrays.toString(args);
        System.out.println(unsorted);
        Arrays.sort(args);
        System.out.println();
        String sorted = Arrays.toString(args);
        System.out.println(sorted);
    }
}
