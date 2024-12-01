public class main {

    public static void main(String[] args) {
        int summ = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                summ = summ - i * i;
            } else {
                summ = summ + i * i;
            }
        }
        System.out.println(summ);
    }
}
