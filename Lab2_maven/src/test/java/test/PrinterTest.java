package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {

	@Test
	public void testPrinter() {
		Junit test = new Junit();
		String result = test.printer("aaabbbhhhyuyyym");
		assertEquals("5/15", result);
		
	}

}
