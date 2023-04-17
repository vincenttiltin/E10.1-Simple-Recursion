import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestRecursion {

	@Test
	public void testFactorial() {
		assertEquals(1, Recursion.factorial(0));
		assertEquals(1, Recursion.factorial(1));
		assertEquals(120, Recursion.factorial(5));
	}

	@Test
	public void testIsEven() {
		assertTrue(Recursion.isEven(0));
		assertTrue(Recursion.isEven(2));

		assertFalse(Recursion.isEven(1));
		assertFalse(Recursion.isEven(3));
	}

	@Test
	public void testSum() {
		assertEquals(10, Recursion.sum(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void testMax() {
		assertEquals(4, Recursion.max(new int[] { 1, 2, 3, 4 }));
		assertEquals(4, Recursion.max(new int[] { 4, 3, 2, 1 }));
		assertEquals(4, Recursion.max(new int[] { 2, 1, 4, 3 }));
		assertEquals(4, Recursion.max(new int[] { 2, 4, 1, 3 }));
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(Recursion.isPalindrome("a"));
		assertTrue(Recursion.isPalindrome("mom"));
		assertTrue(Recursion.isPalindrome("noon"));
		assertTrue(Recursion.isPalindrome("taco cat"));
		assertTrue(Recursion.isPalindrome("a man a plan a canal panama"));

		assertFalse(Recursion.isPalindrome("ma"));
		assertFalse(Recursion.isPalindrome("mama"));
		assertFalse(Recursion.isPalindrome("a man a plan canal panama"));
	}

	@Test
	public void testSlice() {
		Integer[] numbers = { 1, 2, 3, 4, 5 };
		Integer[] result = Recursion.slice(numbers, 1, 4); // Slicing the array from index 1 to 4 (exclusive).

		assertEquals("[2, 3, 4]", Arrays.toString(result));

		result = Recursion.slice(numbers, 2, numbers.length); // Slicing the array from index 2 to end.

		assertEquals("[3, 4, 5]", Arrays.toString(result));
	}

}
