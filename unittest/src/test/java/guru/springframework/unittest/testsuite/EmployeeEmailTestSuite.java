package guru.springframework.unittest.testsuite;

import guru.springframework.unittest.asserts.EmployeeEmailAnnotationsTest;
import guru.springframework.unittest.asserts.EmployeeEmailTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jconnors on 6/6/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeEmailTest.class,
        EmployeeEmailAnnotationsTest.class
})
public class EmployeeEmailTestSuite {
}
