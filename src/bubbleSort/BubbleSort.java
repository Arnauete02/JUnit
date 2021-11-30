package bubbleSort;

public class BubbleSort {
    public double[] asc(double x[]) {
        if (x.length == 0) { throw new NullPointerException("Empty array"); }
        int n = x.length;
        for (int i = 0; i < n; i++) {         	for (int j = i+1; j < n; j++)
            if (x[i] > x[j])
            {
                double temp = x[i];                     x[i] = x[j];                     x[j] = temp;
            }
        }
        return x;
    }

    public double[] desc(double x[]) {
        if (x.length == 0) { throw new NullPointerException("Empty array"); }
        int n = x.length;
        for (int i = 0; i < n; i++) {         	for (int j = i+1; j < n; j++)
            if (x[i] < x[j])
            {
                double temp = x[i];                     x[i] = x[j];                     x[j] = temp;
            }
        }
        return x;
    }
}
