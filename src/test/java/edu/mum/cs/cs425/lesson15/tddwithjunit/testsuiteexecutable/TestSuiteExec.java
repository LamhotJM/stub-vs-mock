package edu.mum.cs.cs425.lesson15.tddwithjunit.testsuiteexecutable;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import edu.mum.cs.cs425.lesson15.tddwithjunit.AllTests;

public class TestSuiteExec {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		for (Failure failure : result.getFailures()) {
			System.out.printf("%s\n", failure);
		}
		System.out.printf("All tests succeeeded? %s\n", result.wasSuccessful() ? "Yes" : "No");
	}

}
