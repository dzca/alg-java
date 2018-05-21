package ca.vollov.alg.labs;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLambda {
	
	@Test
	public void test() {
		System.out.println("call test");
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		
		int sum = numbers.stream().filter(Funcs::isOdd).reduce(0,
				Integer::sum);
		assertEquals(11, sum);
	}
}
