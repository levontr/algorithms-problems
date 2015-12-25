package com.levon.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.levon.algorithms.FindPermutation;

public class FindPermutationTest {

	@Test
	public void test() {
		boolean actual = FindPermutation.permutation("ABCD", "DBAC");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
