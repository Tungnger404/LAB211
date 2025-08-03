/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
     * @param msgInfor      the prompt message displayed to the user
     * @param min           Minimum allowed value
     * @param max           Maximum allowed value
     * @param msgOutOfRange Message shown when input is not in range
     * @param msgTypeError  Message shown when input is not a valid integer
     * @return              A valid integer between min and max
     */
    public static int getInt(String msgInfor, int min, int max,
            String msgOutOfRange, String msgTypeError) {
        while (true) {
            System.out.print(msgInfor);
            try {
                int num = Integer.parseInt(SC.nextLine().trim());
                if (num >= min && num <= max) {
                    return num;
                }
                    System.out.println(msgOutOfRange);
            } catch (NumberFormatException e) {
                System.out.println(msgTypeError);
            }
        }
    }

     /**
     * Prompts the user to enter a string that matches a given regular expression.
     *
     * @param msgInfor   message shown to prompt the user
     * @param REGEX      the pattern that input must match
     * @param msgError   message shown when input doesn't match the pattern
     * @return           a valid string that matches the REGEX
     */
    public static String getString(String msgInfor, 
            final String REGEX, String msgError) {
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
