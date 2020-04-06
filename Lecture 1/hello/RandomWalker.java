/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        while (Math.abs(x) + Math.abs(y) != r) {
            double random = Math.random();
            if (random < 0.25) {
                x = x - 1;
            }
            if (random < 0.5 && random >= 0.25) {
                x = x + 1;
            }
            if (random >= 0.75) {
                y = y - 1;

            }
            else {
                y = y + 1;
            }
            System.out.println("(" + x + "," + y + ")");
            steps += 1;

        }
        System.out.println("steps=" + steps);

    }
}
