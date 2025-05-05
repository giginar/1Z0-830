package section6_localization.resources;

import java.util.*;

public class ResourceBundleExample {
    public static void main(String[] args) {
        Locale locale = new Locale("fr", "FR");
        ResourceBundle bundle = ResourceBundle.getBundle("section6_localization.resources.Messages", locale);

        System.out.println("Greeting: " + bundle.getString("greeting"));
        System.out.println("Farewell: " + bundle.getString("farewell"));
    }
}

