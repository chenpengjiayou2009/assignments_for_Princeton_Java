/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        double probability = 0.25;
        int r = Integer.parseInt(args[0]);
        int steps = 1;
        while (Math.abs(x) + Math.abs(y) != r) {
            System.out.println("(" + x + "," + y + ")");
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

            steps += 1;

        }
        System.out.println("(" + x + "," + y + ")");
        System.out.println("steps=" + steps);

    }
}
