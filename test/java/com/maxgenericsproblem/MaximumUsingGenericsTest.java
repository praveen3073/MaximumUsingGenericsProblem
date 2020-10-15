package com.maxgenericsproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUsingGenericsTest {
    @Test
    public void given3Integers_WhenMaxAtIndex0_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{11, 3, 9});
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Integers_WhenMaxAtIndex1_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{3, 11, 9});
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Integers_WhenMaxAtIndex2_ReturnTrue() {
        int result = MaximumUsingGenerics.findMaxInteger(new Integer[]{9, 3, 11});
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex0_ReturnTrue() {
        float result = MaximumUsingGenerics.findMaxFloat(new Float[]{11.0f, 3.0f, 9.0f});
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex1_ReturnTrue() {
        float result = MaximumUsingGenerics.findMaxFloat(new Float[]{3.0f, 11.0f, 9.0f});
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex2_ReturnTrue() {
        float result = MaximumUsingGenerics.findMaxFloat(new Float[]{9.0f, 3.0f, 11.0f});
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex0_ReturnTrue() {
        String result = MaximumUsingGenerics.findMaxString(new String[]{"Peach", "Apple", "Banana"});
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex1_ReturnTrue() {
        String result = MaximumUsingGenerics.findMaxString(new String[]{"Apple", "Peach", "Banana"});
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex2_ReturnTrue() {
        String result = MaximumUsingGenerics.findMaxString(new String[]{"Banana", "Apple", "Peach"});
        Assert.assertEquals("Peach", result);
    }
}
