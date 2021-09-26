package com.java.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tdd {
	
	

	@Test
	public void test() {
		TddArray tddArray = new TddArray();
		int arr[]= {12, 3, 5, 7, 19 };
		int k= 4;
		int expected = 12;
		int actual = tddArray.kthSmallest(arr, k);
		assertEquals(expected, actual);
	}

}
