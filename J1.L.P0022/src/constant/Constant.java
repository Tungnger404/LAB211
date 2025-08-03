/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constant;

/**
 *
 * @author lenovo
 */
public class Constant {

    public static final String REGEX_NAME = "[a-zA-Z ]+";
    public static final String REGEX_EMAIL = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$";
    public static final String REGEX_DATE = "^(("
            + "(0?[1-9]|1[012])\\/(0?[1-9]|1\\d|2[0-8])"
            + "|(0?[13456789]|1[012])\\/(29|30)|(0?[13578]|1[02])\\/31)\\/(19"
            + "|[2-9]\\d)\\d{2}|0?2\\/29\\/((19|[2-9]\\d)(0[48]|[2468][048]"
            + "|[13579][26])|(([2468][048]|[3579][26])00)))$";
    public static final String REGEX_PHONE = "^(0|\\+84)(\\s|\\.)?((3[2-9])"
            + "|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?"
            + "(\\d{3})(\\s|\\.)?(\\d{3})$";
    public static final int TYPE_EXP = 0;
    public static final int TYPE_FRESHER = 1;
    public static final int TYPE_INTERN = 2;
    public static final String REGEX_RANK = "^(Excellence|Good|Fair|Poor)$";
}
