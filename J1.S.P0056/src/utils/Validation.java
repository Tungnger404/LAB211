package utils;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Validation {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Prompts the user to enter an integer within a specified range.
     *
     * @param msg The prompt message displayed to the user
     * @param min Specifies the minimum allowed value
     * @param max Specifies the maximum allowed value
     * @param msgOutOfRange Displays message shown when input is not in range
     * @param msgTypeError Displays message shown when input is not a valid
     * integer
     * @return Return a valid double between min and max
     */
    public static int getInt(String msg, int min, int max, String msgOutOfRange, String msgTypeError) {
        int result;
        System.out.print(msg);
        while (true) {
            try {
                result = Integer.parseInt(SC.nextLine().trim());
                if (result >= min && result <= max) {
                    return result;
                } else {
                    System.out.println(msgOutOfRange);
                }
            } catch (NumberFormatException e) {
                System.err.print(msgTypeError);
            }
        }
    }

    /**
     * Prompts the user to enter a string that matches a given regular
     * expression.
     *
     * @param msgInfor Message shown to prompt the user
     * @param REGEX The pattern that input must match
     * @param msgError Message shown when input doesn't match the pattern
     * @return A valid string that matches the REGEX
     */
    public static String getString(String msgInfor, final String REGEX, String msgError) {
        while (true) {
            System.out.print(msgInfor);
            String input = SC.nextLine();
            if (input.matches(REGEX)) {
                return input;
            } else {
                System.out.println(msgError);
            }
        }
    }
}
