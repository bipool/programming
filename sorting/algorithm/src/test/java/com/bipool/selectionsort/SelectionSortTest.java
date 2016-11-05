package programming.sorting.algorithm.src.test.java.com.bipool.selectionsort;


import org.junit.Assert;
import org.junit.Test;


public class SelectionSortTest {


	
	@Test
	public void testSorting()
    {
        int[] nums = {4, 5, 2};
        int[] expected = {2, 4, 5};
        SelectionSort selection = new SelectionSort();
        selection.sort(nums);
        Assert.assertArrayEquals(expected, nums);
    }

	@Test
    public void testFullReverseSorting()
    {
        int[] nums = {21, 20, 18, 17, 15, 10, 5, 0};
        int[] expected = {0, 5, 10, 15, 17, 18, 20, 21};
        SelectionSort selection = new SelectionSort();
        selection.sort(nums);
        Assert.assertArrayEquals(expected, nums);
    }

	@Test
    public void testSingleNumber()
    {
        int[] nums = {100};
        int[] expected = {100};
        SelectionSort selection = new SelectionSort();
        selection.sort(nums);
        Assert.assertArrayEquals(expected, nums);
    }
    
	@Test
    public void testTwoNumbers()
    {
        int[] nums = {21, 20};
        int[] expected = {20, 21};
        SelectionSort selection = new SelectionSort();
        selection.sort(nums);
        Assert.assertArrayEquals(expected, nums);
    }

}
