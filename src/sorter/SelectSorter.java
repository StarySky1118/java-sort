package sorter;

import java.util.Comparator;

/**
 * 选择排序
 * 在前arr.length-1个位置，选择其后(包括自身)最小的数放置到此位置。
 * 时间复杂度O(n-1+n-2+...+1)=O(n^2)。
 * 并非两两相邻比较，不稳定。
 * @author Zhang Ziyi
 */
public class SelectSorter implements Sorter{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 此轮循环中最小值和最小值下标
            int min = arr[i], minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}
