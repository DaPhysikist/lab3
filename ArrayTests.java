import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedInPlace2(){
    int[] input2 = {1, 2, 3, 4, 5, 6, 7};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input2 = {8, 9, 10, 11, 12, 13, 14};
    assertArrayEquals(new int[]{14, 13, 12, 11, 10, 11, 10}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input3 = {3.0, 3.0, 7.0, 8.0};
    assertEquals(6.0, ArrayExamples.averageWithoutLowest(input3), 0);
  }
}
