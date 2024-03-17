package sorter;

/**
 * 冒泡排序：对后n-1个位置，将最大的数两两比较移动至此，具体做法是：两两比较，大者右移，像一个水中的气泡不断上浮。
 * 时间复杂度：O(n-1+n-2+...+1)=O(n^2)
 * 稳定性：相邻元素两两比较，是稳定的。
 *
 * @author Zhang Ziyi
 */
public class BubbleSorter implements Sorter {
    @Override
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
}
