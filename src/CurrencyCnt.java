import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CurrencyCnt {

    public static void main(String[] args) {

        final int curr50000 = 50000;
        final int curr10000 = 10000;
        final int curr5000 = 5000;
        final int curr1000 = 1000;
        final int curr500 = 500;
        final int curr100 = 100;

        final int[] currencies = { curr50000, curr10000, curr5000, curr1000, curr500, curr100 };

        int totalAmount = 25000;



        for (int unit : currencies) {
            int quotient = totalAmount / unit;
//            System.out.printf("%d원 %d개%n", unit, quotient);
//            totalAmount -= unit * quotient;

            System.out.printf("%d원 %d개, 나머지: %d %n", unit, quotient, totalAmount - (unit * quotient));

        }
    }

}
