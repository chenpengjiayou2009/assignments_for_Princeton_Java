/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int distance = Integer.parseInt(args[1]);
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (column == 0) {
                    if (Math.abs(column - row) <= distance) {
                        System.out.print("* ");

                    } else {
                        System.out.print(0 + " ");
                    }

                } else {
                    if (Math.abs(column - row) <= distance) {
                        System.out.print(" * ");

                    } else {
                        System.out.print(" " + 0 + " ");
                    }
                }


            }
            System.out.println();
        }

    }
}
