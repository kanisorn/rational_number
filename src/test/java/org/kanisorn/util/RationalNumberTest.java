/**
 * Add some comments......
 */
package org.kanisorn.util;

import static org.junit.Assert.*;
import org.kanisorn.util.RationalNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kanisorn
 *
 */
public class RationalNumberTest {

	private RationalNumber r1;
	private int p = 1;
	private int q = 2;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		r1 = new RationalNumber(p, q);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		r1 = null;
	}

	@Test(expected=IllegalArgumentException.class)
	public void testExcceptionWhenQisLessThanOrEqualsZero() {
		r1 = new RationalNumber(10, -10);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCompareSomeOtherObject() {
		r1 = new RationalNumber(10, 10);
		String r2 = "2/3";
		r1.compareTo(r2);
	}
	
	@test
	public void testEquals() {
		r1 = new RationalNumber(10, 10);
		RationalNumber r2 = new RationalNumber(10, 10);
		r1.equals(r2);
	}
	
	@test
	public void testNotEquals() {
		r1 = new RationalNumber(-10, 10);
		RationalNumber r2 = new RationalNumber(10, 10);
		r1.equals(r2);
	}
	
	@Test
	public void testToString() {
		assertEquals("call method toString() should return p/q", p + "/" + q, r1.toString());
	}
	
	@Test
	public void testSum() {
		int r2p = 2;
    		int r2q = 4;
		RationalNumber r2 = new RationalNumber(r2p, r2q);
		RationalNumber sumR = new RationalNumber((this.p*r2q) + (this.q*r2p), (this.q*r2q));
		
		assertEquals("should equals to sumR", r1.sum(r2), sumR);
		r2 = null;
	}
	
	@Test 
	public void testMultiply() {
		int r2p = 2;
		int r2q = 4;
		
		RationalNumber r2 = new RationalNumber(r2p, r2q);
		RationalNumber sumR = new RationalNumber((this.p*r2p), (this.q*r2q));
		
		assertEquals("should equals to sumR", r1.multiply(r2), sumR);
		r2 = null; 
	}

}
