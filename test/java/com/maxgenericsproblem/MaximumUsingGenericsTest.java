package com.maxgenericsproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUsingGenericsTest {
    @Test
    public void given3Integers_WhenMaxAtIndex0_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{11,3,9});
        Assert.assertEquals(11, result);
    }
}
