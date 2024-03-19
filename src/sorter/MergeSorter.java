package sorter;

import java.util.Arrays;

/**
 * 归并排序：递归地，将待排序序列划分为两个子序列，对两个子序列应用归并排序，然后进行合并。
 * 时间复杂度O(nlog(n))
 * 指定优先选取前半序列的元素，因此是稳定的。
 * @author Zhang Ziyi
 */
public class MergeSorter implements Sorter{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr);
    }

    private void mergeSort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        // 分割点
        int splitPoint = arr.length / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, splitPoint);// 前半序列
        int[] secondHalf = Arrays.copyOfRange(arr, splitPoint, arr.length); // 后半序列
        mergeSort(firstHalf);
        mergeSort(secondHalf);
        merge(arr, firstHalf, secondHalf);
    }

    private void merge(int[] arr, int[] firstHalf, int[] secondHalf) {
        // 双指针，分别指向前半序列和后半序列
        int p1 = 0, p2 = 0;
        int p = 0; // 指向排序序列
        while (p1 < firstHalf.length && p2 < secondHalf.length) {
            if (firstHalf[p1] <= secondHalf[p2]) { // 相等时取前半部分的，保持稳定性
                arr[p] = firstHalf[p1];
                p1++;
            } else {
                arr[p] = secondHalf[p2];
                p2++;
            }
            p++;
        }
        // 将剩余部分全部添加到arr
        while (p1 < firstHalf.length) {
            arr[p] = firstHalf[p1];
            p++;
            p1++;
        }
        while (p2 < secondHalf.length) {
            arr[p] = secondHalf[p2];
            p++;
            p2++;
        }
    }
}
