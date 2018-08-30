import java.util.Arrays;
public class ArgsSort {
    public static void main(String args[]){
        Arrays.sort(args);
        String sorted = Arrays.toString(args);
        System.out.println(sorted);
    }
}
