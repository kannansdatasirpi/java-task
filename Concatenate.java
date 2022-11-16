import java.util.Arrays;

/**
 *  to Concatenate Arrays
 */
public class Concatenate {
    public static void main(String[] args) {
        //two arrays
        int[] arr1 = {1, 4, 9};
        int[] arr2 = {16, 25, 36};
        int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);

        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        //print the result
        for(int element: result) System.out.println(element);
    }
}