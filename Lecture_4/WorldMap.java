public class WorldMap {
    public static void main(String[] args) {
        int xmax = StdIn.readInt();
        int ymax = StdIn.readInt();
        StdDraw.setCanvasSize(xmax, ymax);
        StdDraw.setXscale(0, xmax);
        StdDraw.setYscale(0, ymax);
        StdDraw.enableDoubleBuffering();
        while (!StdIn.isEmpty()) {
            String state = StdIn.readString();
            int v = StdIn.readInt();
            double[] x = new double[v];
            double[] y = new double[v];
            for (int i = 0; i < v; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
