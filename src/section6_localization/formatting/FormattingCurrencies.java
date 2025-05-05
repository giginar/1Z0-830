package section6_localization.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class FormattingCurrencies {
    public static void main(String[] args) {
        double price = 1299.99;

        NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat italyCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);

        System.out.println("US Price: " + usCurrency.format(price));
        System.out.println("Italy Price: " + italyCurrency.format(price));
    }
}
