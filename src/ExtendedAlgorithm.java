public class ExtendedAlgorithm {
    private int first;
    private int second;

    public ExtendedAlgorithm(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void searchGCD() {
        var s = 0; int s1 = 1; int s2 = 0;
        var t = 0; int t1 = 0; int t2 = 1;
        var q = 0;

        while (first != 0 & second != 0) {
            if (first > second) {
                q = first / second;
                first = first % second;
            }
            else {
                q = second / first;
                second = second % first;
            }

            s = s1 - q * s2;
            s1 = s2;
            s2 = s;

            t = t1 - q * t2;
            t1 = t2;
            t2 = t;
        }
        System.out.println("By extended algorithm gcd = " + (first + second)
                + ", s = " + s1 + ", t = " + t1);
    }
}