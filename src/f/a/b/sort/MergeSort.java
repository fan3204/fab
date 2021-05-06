package f.a.b.sort;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] a, int n) {
        mergeSort(a, 0 , n - 1);
    }

    private void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private void merge(int[] a, int left, int mid, int right) {
        //辅助数组
        int[] tmp = new int[a.length];
        //p1、p2是检测指针，k是存放指针
        int p = left;
        int q = mid + 1;
        int k = left;

        while (p <= mid && q <= right) {
            if (a[p] > a[q]) {
                tmp[k++] = a[q++];
            }
            else {
                tmp[k++] = a[p++];
            }
        }

        while (p <= mid) tmp[k++] = a[p++];
        while (q <= right) tmp[k++] = a[q++];

        // 从left到right拷贝，而非0到a.length-1
        for (int i = left; i <= right; i++) {
            a[i] = tmp[i];
        }


    }
}
