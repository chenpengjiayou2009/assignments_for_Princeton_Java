/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        double white = 1.0 - black;
        double red = 255 * white * (1.0 - cyan);
        double green = 255 * white * (1.0 - magenta);
        double blue = 255 * white * (1.0 - yellow);
        int redInt = (int) Math.round(red);
        int greenInt = (int) Math.round(green);
        int blueInt = (int) Math.round(blue);
        System.out.println("red   = " + redInt);
        System.out.println("green = " + greenInt);
        System.out.println("blue  = " + blueInt);

    }
}
