/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;

        for (int trial = 0; trial < trials; trial++) {
            int x = 0;
            int y = 0;
            double probability = 0.25;
            while (Math.abs(x) + Math.abs(y) != r) {
                double random = Math.random();
                if (random < probability) {
                    x = x - 1;
                }
                if (random < probability * 2 && random >= probability) {
                    x = x + 1;
                }
                if (random >= probability * 3) {
                    y = y - 1;

                }
                if (random < probability * 3 && random >= probability * 2) {
                    y = y + 1;
                }
                // System.out.println("(" + x + "," + y + ")");
                totalSteps += 1;
            }

        }
        System.out.println("average number of steps = " + (double) totalSteps / trials);


    }
}
