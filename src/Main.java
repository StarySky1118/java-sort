import sorter.*;

import java.util.Comparator;

/**
 * @author Zhang Ziyi
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        Sorter sorter = new MergeSorter();
        sorter.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
