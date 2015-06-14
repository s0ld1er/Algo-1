package sorting.algos;

public class InsertionSort {
    public int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            final int valueToSort = array[i];
            int j = i;
            //System.arraycopy(src, srcPos, dest, destPos, length);
            while (j > 0 && array[j - 1] > valueToSort) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = valueToSort;
        }

        return array;
    }
}
