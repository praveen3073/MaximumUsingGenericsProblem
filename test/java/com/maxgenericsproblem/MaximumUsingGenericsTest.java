package com.maxgenericsproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUsingGenericsTest {
    @Test
    public void given3Integers_WhenMaxAtIndex0_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{11,3,9});
        Assert.assertEquals(11, result);
    }
    @Test
    public void given3Integers_WhenMaxAtIndex1_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{3,11,9});
        Assert.assertEquals(11, result);
    }
    @Test
    public void given3Integers_WhenMaxAtIndex2_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{9,3,11});
        Assert.assertEquals(11, result);
    }
}
