public class CurrencyCnt2 {
    public static void main(String[] args) {

        final int curr50000 = 50000;
        final int curr10000 = 10000;
        final int curr5000 = 5000;
        final int curr1000 = 1000;
        final int curr500 = 500;
        final int curr100 = 100;
        final int curr50 = 50;
        final int curr10 = 10;

        final int[] currencies = { curr50000, curr10000, curr5000, curr1000, curr500, curr100, curr50, curr10 };

        int totalAmount = 125560;

        for (int unit : currencies) {
            int quotient = totalAmount / unit;

            System.out.printf("%d원 %d개, 나머지: %d %n", unit, quotient, totalAmount - (unit * quotient));
            totalAmount -= unit * quotient;

        }
    }
}
