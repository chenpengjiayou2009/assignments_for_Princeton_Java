/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int[] S = new int[n + 1];
        S[0] = 0;
        for (int i = 1; i <= n; i++) {
            S[i] += S[i - 1] + Integer.parseInt(args[i]);
        }
        int Sn = S[n];
        // System.out.println("S is " + S);
        for (int j = 0; j < m; j++) {
            int r = (int) (Math.random() * Sn);
            int i = 1;
            // System.out.println("r is " + r);
            while (r < S[i - 1] || r >= S[i]) {
                i++;
            }
            System.out.print(i + " ");

        }
        System.out.println();


    }
}
