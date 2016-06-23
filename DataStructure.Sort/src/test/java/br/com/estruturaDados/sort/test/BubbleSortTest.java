package br.com.estruturaDados.sort.test;

import methods.BubbleSortFactory;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		long millis = System.currentTimeMillis();
		BubbleSortFactory bubble = new BubbleSortFactory();
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = bubble.orderly(a);
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		long Endmillis = System.currentTimeMillis();
		System.out.println(Endmillis - millis/100);
		Assert.assertArrayEquals(expected, a);
	}

}
