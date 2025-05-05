package section6_localization.resources;

import java.util.*;

public class ResourceBundleFallbackExample {
    public static void main(String[] args) {
        // Assuming only Messages.properties exists
        Locale unknownLocale = new Locale("es", "MX");
        ResourceBundle bundle = ResourceBundle.getBundle("section6_localization.resources.Messages", unknownLocale);

        System.out.println("Fallback: " + bundle.getString("greeting"));
    }
    // 🔹 If Messages_es_MX.properties doesn’t exist, Java will fallback to:
    // 1 - Messages_es.properties
    // 2 - Messages.properties
    // 3 - MissingResourceException
}

