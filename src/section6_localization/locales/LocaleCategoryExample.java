package section6_localization.locales;

import java.util.Locale;

public class LocaleCategoryExample {
    public static void main(String[] args) {
        Locale.setDefault(Locale.Category.DISPLAY, Locale.GERMAN);
        Locale.setDefault(Locale.Category.FORMAT, Locale.US);

        System.out.println("Display Locale: " + Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println("Format Locale: " + Locale.getDefault(Locale.Category.FORMAT));
    }
    // 🔹 Java separates DISPLAY (UI language) from FORMAT (dates/numbers)
}
