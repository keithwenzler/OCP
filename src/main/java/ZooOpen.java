import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ZooOpen {
    public static void main(String... args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(france);
    }
    public static void printProperties(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("open"));
        System.out.println(resourceBundle.getString("door"));
        System.out.println(resourceBundle.getString("roof"));
        System.out.println(resourceBundle.getString("key"));
        System.out.println(resourceBundle.getString("long"));
        resourceBundle.keySet().stream().forEach(k -> System.out.println(k + "-" + resourceBundle.getString(k)));
        Properties properties = new Properties();
        resourceBundle.keySet().stream().forEach(k -> properties.put(k, resourceBundle.getString(k)));
        System.out.println(properties.getProperty("notReallyAProperty"));
        System.out.println(properties.getProperty("notReallyAProperty", "123"));
    }
}
