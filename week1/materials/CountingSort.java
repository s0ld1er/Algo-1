package sorting.algos;

public class CountingSort {

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int smallest = Integer.MAX_VALUE;
            int smallestAt = i + 1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < smallest) {
                    smallestAt = j;
                    smallest = nums[j];
                }
            }
            int temp = nums[i];
            nums[i] = nums[smallestAt];
            nums[smallestAt] = temp;
        }
    }

}
