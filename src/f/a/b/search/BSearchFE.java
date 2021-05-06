package f.a.b.search;

/**
 * 二分查找的复杂情况，针对存在重复元素的数组，查找第一个相同的元素
 */
public class BSearchFE {

    public int search(int[] a, int n, int value) {

        int low = 0;
        int high = n - 1;

        if (low > high) return -1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            }
            else if (a[mid] < value) {
                low = mid + 1;
            }
            else {
                if (mid == 0 || a[mid - 1] != value) {
                    return mid;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}
