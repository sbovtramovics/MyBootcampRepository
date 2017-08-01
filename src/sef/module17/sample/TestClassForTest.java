package sef.module17.sample;

import junit.framework.TestCase;
import sef.module17.sample.ClassForTest;

public class TestClassForTest extends TestCase {
	ClassForTest classForTest;
	protected void setUp() throws Exception {
		super.setUp();
		classForTest= new ClassForTest();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		classForTest = null;
	}
	public void testAdd() {
		assertEquals("Wrong", 16, classForTest.add(10, 5));
	}
}
