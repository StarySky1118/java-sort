import sorter.BubbleSorter;
import sorter.InsertSorter;
import sorter.SelectSorter;
import sorter.Sorter;

import java.util.Comparator;

/**
 * @author Zhang Ziyi
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        Sorter sorter = new InsertSorter();
        sorter.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
