/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[0]);
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += Math.pow((double) 1 / i, r);
        }
        System.out.println(result);
    }
}
