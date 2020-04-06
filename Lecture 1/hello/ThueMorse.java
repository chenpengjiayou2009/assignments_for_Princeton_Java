/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        arr[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            }
            else if (i % 2 == 1) {
                arr[i] = 1 - arr[i / 2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }

            }
            System.out.println();

        }

    }
}