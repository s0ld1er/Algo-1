package sorting.algos;

public class QuickSort {

    public void sort(int[] array) {
        quickRec(array, 0, array.length - 1);
    }

    private void quickRec(int[] array, int startIndex, int endIndex) {
        int index = partition(array, startIndex, endIndex);
        if (startIndex < index - 1) {
            quickRec(array, startIndex, index - 1);
        }

        if (endIndex > index) {
            quickRec(array, index, endIndex);
        }
    }

    private int partition(int[] array, int left, int right) {
        final int pivot = array[left];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                left++;
                right--;
            }
        }
        return left;
    }
}
