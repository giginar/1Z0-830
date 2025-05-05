package section6_localization.locales;

import java.util.Locale;

public class CreatingLocales {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("Default Locale: " + defaultLocale);

        Locale french = new Locale("fr");
        Locale canadianFrench = new Locale("fr", "CA");
        Locale italian = Locale.of("it", "IT");

        System.out.println("French: " + french);
        System.out.println("Canadian French: " + canadianFrench);
        System.out.println("Italian: " + italian);
    }

    // 🔹 Locales can be created with:
    // new Locale(languageCode)
    // new Locale(language, country)
    // Locale.of(language, country) (Java 19+)
}
