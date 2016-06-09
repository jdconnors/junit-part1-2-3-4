package guru.springframework.unittest.matchers;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by jconnors on 6/9/16.
 */
public class TextComparisonMatchersTest {
    MatchersDemo matchersDemo;
    String actual;

    @Before
    public void setup() {
        matchersDemo = new MatchersDemo();
        actual = matchersDemo.toConcatenatedUpperCase("Hello", "World");
    }

    @Test
    public void testIgnoringCase() throws Exception {
        assertThat(actual, equalToIgnoringCase("HelloWORld"));
    }

    @Test
    public void testIgnoringWhitespace() throws Exception {
        assertThat(actual, equalToIgnoringWhiteSpace("  HELLOWORLD "));
    }

    @Test
    public void testContainsInOrder() throws Exception {
        assertThat("Actual string under test", stringContainsInOrder(Arrays.asList("Actual", "string", "under", "test")));
    }

    @Test
    public void testContainsInOrderNotContiguous() throws Exception {
        assertThat("Actual string under dog test", stringContainsInOrder(Arrays.asList("Actual", "string", "under", "test")));
    }
}
