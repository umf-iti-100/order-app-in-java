package thiagodnf.order.utils;

import java.util.Scanner;

public class ConsoleUtils {

    public static String askString(String prefix) {

        System.out.print(prefix);

        // Ask the user for any string
        String text = new Scanner(System.in).nextLine();

        if (text == null) {
            return null;
        }

        // A good approach would be removing all leading and trailing spaces before returning it
        return text.trim();
    }

    public static int askInteger(String field) {

        String text = ConsoleUtils.askString(field);

        return Integer.parseInt(text);
    }

    public static double askDouble(String field) {

        String text = ConsoleUtils.askString(field);

        return Double.parseDouble(text);
    }

}