package guru.springframework.unittest.parameterized;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jconnors on 6/9/16.
 */
public class EmailIdUtility {

    public static String createEmailId(String firstPart, String secondPart) {
        String generatedId = firstPart + "." + secondPart + "@testdomain.com";
        return generatedId;
    }

    public static boolean isValid(String email) {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }
}
