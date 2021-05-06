package f.a.b.sort;

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 移动数据
                    a[j + 1] = a[j];
                }
                else {
                    break;
                }
            }
            // 插入数据
            a[j + 1] = value;
        }
    }
}
