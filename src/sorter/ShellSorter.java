package sorter;

/**
 * 希尔排序：也叫缩小增量排序，是插入排序的变体。选取一个缩小增量ti序列，如[len/2, len/4, ... ,1]，对于每个增量ti，对这
 * ti个子序列使用插入排序。最后当ti=1时，便是对整个序列排序。
 * 时间复杂度：平均为O(nlog(n))
 * 稳定性：属于插入系排序，并非两两相邻元素比较，因此不稳定。
 * @author Zhang Ziyi
 */
public class ShellSorter implements Sorter{
    @Override
    public void sort(int[] arr) {
        for (int t = arr.length / 2; t >= 1; t /= 2) { // 对每个增量
            for (int i = 0; i < t; i++) { // 对每个子序列
                generalInsertSort(i, t, arr);
            }
        }
    }

    private void generalInsertSort(int startIndex, int incr, int[] arr) {
        for (int i = startIndex + incr; i < arr.length; i += incr) {
            for (int j = i; j > startIndex; j -= incr) {
                if (arr[j] < arr[j - incr]) {
                    swap(arr, j, j - incr);
                } else {
                    break;
                }
            }
        }
    }
}
