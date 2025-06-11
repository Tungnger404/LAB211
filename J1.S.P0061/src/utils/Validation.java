 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

public class Validation {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Prompts the user to enter an double within a specified range.
     *
     * @param msg           The prompt message displayed to the user
     * @param min           Specifies the minimum allowed value
     * @param max           Specifies the maximum allowed value
     * @param msgOutOfRange Displays message shown when input is not in range
     * @param msgTypeError  Displays message shown when input is not a valid integer
     * @return              Return a valid double between min and max
     */
    public static double getDouble(String msg, double min, double max, String msgOutOfRange, String msgTypeError) {
        double result;
        while (true) {
            System.out.print(msg);
            try {
                result = Double.parseDouble(SC.nextLine().trim());
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
}
