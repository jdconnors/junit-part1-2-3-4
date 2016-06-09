package guru.springframework.unittest.matchers;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jconnors on 6/6/16.
 */
public class MatchersDemo {

    public String toConcatenatedUpperCase(String str1, String str2) {
        return str1.concat(str2).toUpperCase();
    }

    public Double floatingPointMultiplication(double num1, double num2) {
        return num1 * num2;
    }

    private Set<String> stringCol = new HashSet<>();

    public boolean addStringToCollection(final String newString) {
        return this.stringCol.add(newString);
    }

    public Set<String> getStringCollection() {
        return this.stringCol;
    }
}
