package com.bipool.bubblesort;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BubbleSortTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BubbleSortTest.class );
    }

    public void testSorting()
    {
        int[] nums = new int[]{4, 5, 2};
        int[] expected = new int[]{2, 4, 5};
        BubbleSort.bubbleSort(nums);
        Assert.assertArrayEquals(expected, nums);
    }


    public void testFullReverseSorting()
    {
        int[] nums = new int[]{21, 20, 18, 17, 15, 10, 5, 0};
        int[] expected = new int[]{0, 5, 10, 15, 17, 18, 20, 21};
        BubbleSort.bubbleSort(nums);
        Assert.assertArrayEquals(expected, nums);
    }

    public void testSingleNumber()
    {
        int[] nums = new int[]{100};
        int[] expected = new int[]{100};
        BubbleSort.bubbleSort(nums);
        Assert.assertArrayEquals(expected, nums);
    }
    
    public void testTwoNumbers()
    {
        int[] nums = new int[]{21, 20};
        int[] expected = new int[]{20, 21};
        BubbleSort.bubbleSort(nums);
        Assert.assertArrayEquals(expected, nums);
    }
    
}
