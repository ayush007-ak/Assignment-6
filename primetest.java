package com.java.prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class primetest {

	@Test
	public void test() {
		primeTestmain primeNxt = new primeTestmain();
		int arr[] = {1,2,3,4,5,6,7};
		int n =arr.length;
		int expected = 4;
		int actual = primeNxt.primeCount(arr, n);
		assertEquals(expected, actual);
		
		
	}

}
