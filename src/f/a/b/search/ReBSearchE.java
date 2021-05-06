package f.a.b.search;

/**
 * 二分查找递归实现，针对有序且无重复元素的数组
 */
public class ReBSearchE {

    public int search(int[] a, int n, int value) {
        return searchInternally(a, 0, n - 1, value);
    }

    private int searchInternally(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        }
        else if (a[mid] < value) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
        return searchInternally(a, low, high, value);
    }
}
