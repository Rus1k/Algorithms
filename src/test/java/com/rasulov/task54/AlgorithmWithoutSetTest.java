package com.rasulov.task54;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlgorithmWithoutSetTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCheckingForDuplicateFalse() throws Exception {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 4;
        array[3] = 5;
        array[4] = 2;
        Assert.assertFalse(AlgorithmWithoutSet.checkingForDuplicate(array));
    }
    @Test
    public void testCheckingForDuplicateBetterPerformanceFalse() throws Exception {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 4;
        array[3] = 5;
        array[4] = 2;
        Assert.assertFalse(AlgorithmWithoutSet.checkingForDuplicateBetterPerformance(array));
    }

    @Test
    public void testCheckingForDuplicateTrue() throws Exception {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;
        array[4] = 2;
        Assert.assertTrue(AlgorithmWithoutSet.checkingForDuplicate(array));
    }
    @Test
    public void testCheckingForDuplicateBetterPerformanceTrue() throws Exception {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;
        array[4] = 2;
        Assert.assertTrue(AlgorithmWithoutSet.checkingForDuplicateBetterPerformance(array));
    }
    @Test
    public void testCheckingForDuplicateAnotherTrue() throws Exception {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;
        array[4] = 2;
        array[5] = 2;
        array[6] = 4;
        array[7] = 10;
        array[8] = 3;
        array[9] = 2;
        Assert.assertTrue(AlgorithmWithoutSet.checkingForDuplicate(array));
    }
    @Test
    public void testCheckingForDuplicateBetterPerformanceAnotherTrue() throws Exception {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 5;
        array[4] = 2;
        array[5] = 2;
        array[6] = 4;
        array[7] = 10;
        array[8] = 3;
        array[9] = 2;
        Assert.assertTrue(AlgorithmWithoutSet.checkingForDuplicateBetterPerformance(array));
    }
    @Test
    public void testCheckingForDuplicateValueBoundException() throws Exception {
        expectedException.expect(ValueBoundException.class);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 6;
        array[4] = 2;
        AlgorithmWithoutSet.checkingForDuplicate(array);
    }
    @Test
    public void testCheckingForDuplicateBetterPerformanceValueBoundException() throws Exception {
        expectedException.expect(ValueBoundException.class);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;
        array[3] = 6;
        array[4] = 2;
        AlgorithmWithoutSet.checkingForDuplicateBetterPerformance(array);
    }

    @Test
    public void testCheckingForDuplicateNegativeException() throws Exception {
        expectedException.expect(NegativeMeaningException.class);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = -1;
        array[3] = 5;
        array[4] = 2;
        AlgorithmWithoutSet.checkingForDuplicate(array);
    }
    @Test
    public void testCheckingForDuplicateBetterPerformanceNegativeException() throws Exception {
        expectedException.expect(NegativeMeaningException.class);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = -1;
        array[3] = 5;
        array[4] = 2;
        AlgorithmWithoutSet.checkingForDuplicateBetterPerformance(array);
    }
}