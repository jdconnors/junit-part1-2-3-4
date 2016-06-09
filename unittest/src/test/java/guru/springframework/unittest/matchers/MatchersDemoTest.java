package guru.springframework.unittest.matchers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by jconnors on 6/6/16.
 */
public class MatchersDemoTest {
    MatchersDemo matchersDemo;

    @Before
    public void setup() {
        matchersDemo = new MatchersDemo();
    }

    @Test
    public void testToConcatenatedUpperCase() throws Exception {
        String expected = "HELLOWORLD";
        String actual = matchersDemo.toConcatenatedUpperCase("hello", "world");
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testToConcatenatedUpperCaseStartWith() throws Exception {
        String expected = "HELLO";
        String actual = matchersDemo.toConcatenatedUpperCase("hello", "world");
        assertThat(actual, startsWith(expected));
    }

    @Test
    public void testToConcatenatedUpperCaseContainsString() throws Exception {
        String expected = "WORLD";
        String actual = matchersDemo.toConcatenatedUpperCase("hello", "world");
        assertThat(actual, containsString(expected));
    }

    @Test
    public void testConcatenatedUpperCaseForAllMatchers() throws Exception {
        String expected = "HELLO";
        String actual = matchersDemo.toConcatenatedUpperCase("hello", "world");
        assertThat(actual, is(allOf(notNullValue(), instanceOf(String.class), startsWith(expected), containsString(expected))));
    }
}
