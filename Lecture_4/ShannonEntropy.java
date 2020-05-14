public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] x = new int[m];
        double[] p = new double[m];
        double count = 0;
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            x[i - 1] += 1;
            count++;
        }
        double sum = 0;
        for (int i = 0; i < m; i++) {
            if (x[i] == 0) {
                p[i] = 0;
            } else {
                p[i] = -(x[i] / count) * ((Math.log(x[i] / count)) / Math.log(2));
            }
            sum += p[i];
        }
        StdOut.printf("%.4f", sum);
    }
}


