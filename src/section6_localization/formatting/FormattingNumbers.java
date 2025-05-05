package section6_localization.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {
    public static void main(String[] args) {
        double amount = 12345.678;

        Locale us = Locale.US;
        Locale germany = Locale.GERMANY;
        Locale france = Locale.FRANCE;

        NumberFormat usFormat = NumberFormat.getNumberInstance(us);
        NumberFormat germanFormat = NumberFormat.getNumberInstance(germany);
        NumberFormat frenchFormat = NumberFormat.getNumberInstance(france);

        System.out.println("US: " + usFormat.format(amount));
        System.out.println("Germany: " + germanFormat.format(amount));
        System.out.println("France: " + frenchFormat.format(amount));
    }
}
