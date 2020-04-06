/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double sumcount = 0;
        double fraction = 0;
        for (int i = 1; fraction < 0.5; i++) {
            int count = 0;
            for (int j = 0; j < trials; j++) {
                boolean[] arr = new boolean[n];
                int people = 1;
                int birthday = (int) (Math.random() * n);
                while (!arr[birthday]) {
                    arr[birthday] = true;
                    birthday = (int) (Math.random() * n);
                    // System.out.println("birthday is " + birthday);
                    people++;
                }
                // System.out.println(people + "people");
                if (people == i) {
                    count++;
                }
            }
            sumcount += count;
            fraction = sumcount / trials;
            System.out.println(i + "  " + count + "  " + fraction);
        }

    }
}

