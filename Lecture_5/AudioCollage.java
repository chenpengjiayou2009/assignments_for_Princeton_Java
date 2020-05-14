public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            a[i] = a[i] * alpha;
        }
        return a;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int len = a.length;
        double[] b = new double[len];
        for (int i = 0; i < len; i++) {
            b[len - i - 1] = a[i];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int lenA = a.length;
        int lenB = b.length;
        double[] c = new double[lenA + lenB];
        for (int i = 0; i < lenA; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < lenB; i++) {
            c[lenA + i] = b[i];
        }

        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int min = Math.min(lenA, lenB);
        int max = Math.max(lenA, lenB);
        double[] c = new double[max];
        for (int i = 0; i < min; i++) {
            c[i] = a[i] + b[i];
        }
        if (lenA < lenB) {
            for (int i = min; i < max; i++) {
                c[i] = b[i];
            }
        } else {
            for (int i = min; i < max; i++) {
                c[i] = a[i];
            }

        }
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double newLen = a.length / alpha;
        double[] b = new double[newLen];
        for (int i = 0; i < newLen; i++) {
            b[i] = a[i * alpha];
        }
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] a = StdAudio.read("beatbox.wav");
        double[] b = StdAudio.read("beatbox.wav");
        StdAudio.play(amplify(a, 0.5));
        StdAudio.play(reverse(a));
        StdAudio.play(merge(a, b));
        StdAudio.play(mix(a, b));
        StdAudio.play(changeSpeed(a, 0.5));
    }
}
