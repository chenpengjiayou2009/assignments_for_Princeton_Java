/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (int i = 2; i <= n / i; i++) {
            System.out.println("i is ");
            System.out.println(i);
            System.out.println("n is ");
            System.out.println(n);
            System.out.println("---------");
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.println(n);

        }
        else {
            System.out.println();
        }

    }
}
