package custom;

public class QuickSort {
    //TODO
    public static void sort(int[] array) {
        int deepIndex = 0;
        int pivot = array[deepIndex];
        for (int i = array.length - 1; i >= 0; i--) {
            int val = array[i];
            if (val < pivot) {
                array[deepIndex] = val;
                deepIndex = i;
            }
        }
    }
}
