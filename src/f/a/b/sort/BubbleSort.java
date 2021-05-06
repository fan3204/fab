package f.a.b.sort;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] a, int n) {
        if (n <=1 ) return;
        for (int i = 0; i < n; i++) {
            // 提前退出冒泡排序的标志位
            boolean flag = false;
            for (int j = 0; j < n - 1- i; j++) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }

            if (!flag) break;
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] a = {1, 5, 4, 7, 6, 9};
        sort.sort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
