package guru.springframework.unittest.quickstart;

/**
 * Hello world!
 *
 */
public class App
{
    public String concatAndConvertString(String str1, String str2) {
        String concatenatedString = str1.concat(str2);
        return concatenatedString.toUpperCase();
    }
}
