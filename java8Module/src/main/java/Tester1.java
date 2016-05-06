import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by aleks on 29.10.15.
 */
public class Tester1 {

    public static void test1() {

        Main main = (Main) null;
        System.out.println(main);
    }

    public static void test2() {

            String s = null;
            throw new OutOfMemoryError();

    }
    public static void test3(String... s) {
            test33(s);
            System.out.println(Arrays.toString(s));

    }
    public static void test33(String... s) {

            System.out.println(Arrays.toString(s));

    }

    public static void test4() {
        String s = "PRIMERA &quot;Codi 354 &#1081\uD83D\uDD14";
        s = new StringWithoutSurrogates(s).get();
        System.out.println("s: "  + s);
    }

    public static void test7() {
        Person p = new Person("Alex", Person.Sex.MALE, 10,"");
        Man m = new Man("Alex", Person.Sex.MALE, 25,"");

        System.out.println("p instance of: " + (p instanceof Man));
        System.out.println("m instance of: " + (m instanceof Man));
    }

    public static void test8() {
        System.out.println(replace("\"GB2210 Exeter-DirectToday\"", "(\\D+)(\\d+)(\\D+)", "$2"));
    }
    public static void test9() {
        try {
            String dateString = "18/05/2016 15:43:15";
            String format = "dd/MM/yyyy HH:mm";

            System.out.println(dateString + " : " + isDateCorrect(dateString, format));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void test10() {
        int i = 0;
        String[] arr = {"444", "333", "111", "222", "666", "888"};
        for(i = 0; i < arr.length; i++) {
            if(arr[i].equals("111")) {
                break;
            }
        }
        if(i == arr.length - 1) return;

        for(int k = i; k < arr.length; i++) {
                arr[k] = arr[k + 1];
        }

    }

    public static void test11() {
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(Integer.valueOf(c1));System.out.println(Integer.valueOf(c2));System.out.println(Integer.valueOf(c3));System.out.println(c1 + c2 + c3);

    }

    private static boolean isDateCorrect(String dateString, String format) {
        try {
            String yyyy = format.substring(format.toLowerCase().indexOf("y"), format.toLowerCase().lastIndexOf("y") + 1);
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date date = sdf.parse(dateString);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if(String.valueOf(calendar.get(Calendar.YEAR)).trim().length() == yyyy.length()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }

    private static String replace(String string, String regExp, String replaceWith) {
        if (regExp != null && replaceWith != null) {
            return string.replaceAll(regExp, replaceWith);
        } else {
            return string;
        }
    }

    public static void main(String[] args) {
        test11();
    }
}
