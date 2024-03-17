package sorter;

import java.util.Comparator;

/**
 * 排序器
 * @author Zhang Ziyi
 */
public interface Sorter {
    void sort(int[] arr);

    // 交换arr[i]和arr[j]
    default void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
