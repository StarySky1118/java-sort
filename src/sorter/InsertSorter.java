package sorter;

/**
 * 插入排序：初始情况下，将首个元素视为排好序的序列，从第二个元素开始，不断插入并形成排好序的序列。
 * 时间复杂度O(1+2+...+n-1)=O(n^2)
 * 由于是两两比较交换，因此是稳定的。
 * @author Zhang Ziyi
 */
public class InsertSorter implements Sorter {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 将 arr[i] 插入 [0,...,i-1]，方法是不断比较并交换
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
