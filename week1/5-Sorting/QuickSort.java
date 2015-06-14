package sorting.algos;

public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int startIndex, int endIndex) {
        int index = partition(array, startIndex, endIndex);
        if (startIndex < index - 1) {
            quickSort(array, startIndex, index - 1);
        }

        if (endIndex > index) {
            quickSort(array, index, endIndex);
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
