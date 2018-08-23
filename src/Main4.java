import java.util.Arrays;
public class Main4 {

    public static void main(String[] args) {

        int[] array = {183, 123, 32, 13, 144, 13, 124, 125, 57, 56, 82, 943};
        int y = array[0];
        array[0] = array[array.length -1];
        array[array.length - 1] = y;
        System.out.println(Arrays.toString(array));

    }

}

