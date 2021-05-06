package f.a.b.sort;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] a, int n) {
        if (n <= 1) return;
        sort(a, 0, n - 1);
    }

    private void sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int partition = getPartition(a, left, right);
        System.out.println("l:" + left);
        System.out.println("m:" + partition);
        System.out.println("r:" + right);
        sort(a, left, partition - 1);
        sort(a, partition + 1, right);
    }

    private int getPartition(int[] a, int left, int right) {
        int point = a[right];
        int i = left;
        for (int j = left; j <= right - 1; j++) {
            // 左大右小
            if (a[j] > point) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }

        int tmp = a[i];
        a[i] = a[right];
        a[right] = tmp;

        return i;
    }
}
