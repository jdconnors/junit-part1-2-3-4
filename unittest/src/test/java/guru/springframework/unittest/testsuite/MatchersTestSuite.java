package guru.springframework.unittest.testsuite;

import guru.springframework.unittest.matchers.CollectionMatchersTest;
import guru.springframework.unittest.matchers.MatchersDemoTest;
import guru.springframework.unittest.matchers.NumberMatchersTest;
import guru.springframework.unittest.matchers.TextComparisonMatchersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jconnors on 6/9/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CollectionMatchersTest.class,
        MatchersDemoTest.class,
        NumberMatchersTest.class,
        TextComparisonMatchersTest.class
})
public class MatchersTestSuite {
}
