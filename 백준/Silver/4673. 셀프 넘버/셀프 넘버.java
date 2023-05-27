public class Main {
    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int dn = getSelfNumber(i);
            if (dn <= 10000) {
                isSelfNumber[dn] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getSelfNumber(int n) {
        int dn = n;
        while (n > 0) {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}
