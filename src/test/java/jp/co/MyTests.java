package jp.co;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author ii
 *
 * Date Created: Nov 18, 2017
 */

public class MyTests {

	@Test
	public void multiplicatinOfZeroInteger(){
		MyClass tester = new MyClass();
		
		assertEquals(0, tester.multiply(10, 0));
		assertEquals(0, tester.multiply(0, 10));
		assertEquals(0, tester.multiply(0, 0));
	}
}
