package f.a.b.sort;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    min = j;
                }
            }

            if (min != i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }
}
