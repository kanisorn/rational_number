/**
 * 
 */
package org.kanisorn.util;

/**
 * @author kanisorn
 *
 */
public class RationalNumber {
	private int p;
	private int q;
	
	public RationalNumber(int p, int q) {
		if (q<=0)
			throw new IllegalArgumentException("q value must be greater than zero");
		
		this.q = q;
		this.p = p;
	}
	
	@Override
	public String toString() {
		return this.p + "/" + this.q;
	}
	
	public RationalNumber sum(RationalNumber that) {
		return new RationalNumber((this.p * that.q) + (this.q * that.p), (this.q * that.q));
	}
	
	public RationalNumber multiply(RationalNumber that) {
		return new RationalNumber((this.p * that.p), (this.q * that.q));
	}
	
	public int compareTo(Object o) {
		if (!(o instanceof RationalNumber))
			throw new IllegalArgumentException("cannot compare object other than RationalNumber");
		
		RationalNumber that = (RationalNumber)o;
		
		int thisP = this.p * that.q;
		int thatP = that.p * this.q;
		
		if (thisP == thatP)
			return 0;
		else if (thisP < thatP)
			return -1;
		else
			return 1;
	}
	
	public boolean equals(Object o) {
		return compareTo(o)==0?true:false;
	}
}
