
class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class MinMaxArray {
    static Pair getMinMax(long a[], long n) {
        int min_idx = 0;
        int max_idx = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if (a[min_idx] > a[i]) {
                min_idx = i;
            }
            if (a[max_idx] < a[i]) {
                max_idx = i;
            }
        }

        return new Pair(a[min_idx], a[max_idx]);
    }

    public static void main(String args[]) {
        long a[] = {3, 2, 1, 56, 1000, 167};
        int size = 6;
        Pair pair = getMinMax(a, size);
        System.out.println(pair.first+" - "+ pair.second);
    }
}
