import java.util.Arrays;
import java.util.Collections;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = nums[i];
            nums[i] = nums[min];
            nums[min] = swap;
        }
    }

    public static void main(String[] args) {
        /*int[] array = new int[]{16, 5, 30, 6, 7, 2};
        selectionSort(array);
        System.out.println(Arrays.toString(array));*/

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Shuffle array
        Collections.shuffle(Arrays.asList(array));

        // Print shuffled collection
        System.out.println(Arrays.toString(array));

        long startTime = System.nanoTime();
        selectionSort(array);
        long endTime = System.nanoTime();

        // Print sorted collection
        System.out.println(Arrays.toString(array));

        // Print runtime in seconds
        System.out.println("Selection Sort runtime: " + (endTime - startTime));
    }
}
