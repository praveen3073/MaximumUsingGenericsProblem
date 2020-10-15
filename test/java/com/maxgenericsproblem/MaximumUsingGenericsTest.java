package com.maxgenericsproblem;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUsingGenericsTest {
    @Test
    public void given3Integers_WhenMaxAtIndex0_ReturnTrue() {
        int result = MaximumUsingGenerics.findMax(new Integer[]{11, 3, 9});
        Assert.assertEquals(11, result);
        MaxTestInput<Integer> intInput = new MaxTestInput<>(new Integer[]{11, 3, 9});
        result = intInput.testMaximum();
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Integers_WhenMaxAtIndex1_ReturnTrue() {
        int result = MaximumUsingGenerics.findMax(new Integer[]{3, 11, 9});
        Assert.assertEquals(11, result);
        MaxTestInput<Integer> intInput = new MaxTestInput<>(new Integer[]{3, 11, 9});
        result = intInput.testMaximum();
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Integers_WhenMaxAtIndex2_ReturnTrue() {
        int result = MaximumUsingGenerics.findMax(new Integer[]{9, 3, 11});
        Assert.assertEquals(11, result);
        MaxTestInput<Integer> intInput = new MaxTestInput<>(new Integer[]{9, 3, 11});
        result = intInput.testMaximum();
        Assert.assertEquals(11, result);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex0_ReturnTrue() {
        float result = MaximumUsingGenerics.findMax(new Float[]{11.0f, 3.0f, 9.0f});
        Assert.assertEquals(11.0, result, 0.0);
        MaxTestInput<Float> intInput = new MaxTestInput<>(new Float[]{11.0f, 3.0f, 9.0f});
        result = intInput.testMaximum();
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex1_ReturnTrue() {
        float result = MaximumUsingGenerics.findMax(new Float[]{3.0f, 11.0f, 9.0f});
        Assert.assertEquals(11.0, result, 0.0);
        MaxTestInput<Float> intInput = new MaxTestInput<>(new Float[]{3.0f, 11.0f, 9.0f});
        result = intInput.testMaximum();
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Floats_WhenMaxAtIndex2_ReturnTrue() {
        float result = MaximumUsingGenerics.findMax(new Float[]{9.0f, 3.0f, 11.0f});
        Assert.assertEquals(11.0, result, 0.0);
        MaxTestInput<Float> intInput = new MaxTestInput<>(new Float[]{9.0f, 3.0f, 11.0f});
        result = intInput.testMaximum();
        Assert.assertEquals(11.0, result, 0.0);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex0_ReturnTrue() {
        String result = MaximumUsingGenerics.findMax(new String[]{"Peach", "Apple", "Banana"});
        Assert.assertEquals("Peach", result);
        MaxTestInput<String> intInput = new MaxTestInput<>(new String[]{"Peach", "Apple", "Banana"});
        result = intInput.testMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex1_ReturnTrue() {
        String result = MaximumUsingGenerics.findMax(new String[]{"Apple", "Peach", "Banana"});
        Assert.assertEquals("Peach", result);
        MaxTestInput<String> intInput = new MaxTestInput<>(new String[]{"Apple", "Peach", "Banana"});
        result = intInput.testMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given3Strings_WhenMaxAtIndex2_ReturnTrue() {
        String result = MaximumUsingGenerics.findMax(new String[]{"Banana", "Apple", "Peach"});
        Assert.assertEquals("Peach", result);
        MaxTestInput<String> intInput = new MaxTestInput<>(new String[]{"Banana", "Apple", "Peach"});
        result = intInput.testMaximum();
        Assert.assertEquals("Peach", result);
    }
}
