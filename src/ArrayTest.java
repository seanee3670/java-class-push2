import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
