package section6_localization.formatting;

import java.text.DecimalFormat;

public class CustomNumberFormatExample {
    public static void main(String[] args) {
        double number = 12345.678;

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Formatted: " + df.format(number));
    }
    // 🔹 DecimalFormat allows for detailed custom formats like "###,###.##" or "00000.00"
}
