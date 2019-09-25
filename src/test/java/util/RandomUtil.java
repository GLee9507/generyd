package util;

public class RandomUtil {
    public static int nextInt(int from, int to) {
        int realForm = from, realTo = to;
        if (from < 0) {
            realForm = 0;
            realTo = to + from * -1;
        }
        int v = realForm + (int) (Math.random() * (realTo + 1 - realForm));
        if (v > to) {
            v = v - from;
        }
        return v;
    }
}
