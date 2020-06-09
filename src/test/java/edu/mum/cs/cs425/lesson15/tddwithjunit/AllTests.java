package edu.mum.cs.cs425.lesson15.tddwithjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithmeticOpsTest.class, FibonaccciGeneratorTest.class })
public class AllTests {

}
