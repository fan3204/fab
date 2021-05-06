package f.a.b.search;

public class BSearchLLE {

    public int search(int[] a, int n, int value) {

        int low = 0;
        int high = n - 1;

        if (low > high) return -1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == n - 1 || a[mid + 1] > value) {
                    return mid;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
