package com.rasulov.task54;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AlgorithmTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCheckingForDuplicateTrue() throws Exception {
        int [] array = new int[10];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        array[3] = 7;
        array[4] = 3;
        array[5] = 2;
        array[6] = 6;
        array[7] = 7;
        array[8] = 9;
        array[9] = 10;
        Assert.assertTrue(Algorithm.checkingForDuplicate(array));
    }
    @Test
    public void testCheckingForDuplicateFalse() throws Exception {
        int [] array = new int[10];
        array[0] = 1;
        array[1] = 5;
        array[2] = 2;
        array[3] = 7;
        array[4] = 3;
        array[5] = 4;
        array[6] = 6;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        Assert.assertFalse(Algorithm.checkingForDuplicate(array));
    }
    @Test
    public void testNullException(){
        expectedException.expect(NullPointerException.class);
        Algorithm.checkingForDuplicate(null);
    }
    @Test
    public void testValueBoundException(){
        expectedException.expect(ValueBoundException.class);
        int [] array = new int [5];
        array [0] = 1;
        array [1] = 3;
        array [2] = 2;
        array [3] = 6;
        array [4] = 5;
        Algorithm.checkingForDuplicate(array);
    }
    @Test
    public void testNegativeMeaningException(){
        expectedException.expect(NegativeMeaningException.class);
        int [] array = new int [5];
        array [0] = 1;
        array [1] = 1;
        array [2] = 2;
        array [3] = 4;
        array [4] = 5;
        Algorithm.checkingForDuplicate(array);
    }
}
