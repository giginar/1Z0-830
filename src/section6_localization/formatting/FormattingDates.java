package section6_localization.formatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 5, 1);

        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.US);
        DateTimeFormatter deFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMANY);
        DateTimeFormatter frFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRANCE);

        System.out.println("US: " + date.format(usFormatter));
        System.out.println("Germany: " + date.format(deFormatter));
        System.out.println("France: " + date.format(frFormatter));
    }
    // 🔹 Use DateTimeFormatter.ofPattern(pattern, locale) for locale-sensitive date output.
}

