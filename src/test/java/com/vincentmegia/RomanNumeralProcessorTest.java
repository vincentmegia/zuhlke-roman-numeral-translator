package com.vincentmegia;

import org.junit.Assert;
import org.junit.Test;

/**
 * Rigorous Test :-)
 * I = 1
 * II = 2
 * III = 3

 * V = 5


 * X = 10
 *
 *  * IV = 4
 *  VI = 6
 *  * VII = 7
 *  * VIII = 8
 *   * IX = 9
 */
public class RomanNumeralProcessorTest {

    @Test
    public void test_Process() {
        var component = new RomanNumeralProcessor();
        var result = component.process("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test_Process_Roman_I() {
        var component = new RomanNumeralProcessor();
        var result = component.process("I");
        Assert.assertEquals(1, result);
    }

    @Test
    public void test_Process_Roman_II() {
        var component = new RomanNumeralProcessor();
        var result = component.process("II");
        Assert.assertEquals(2, result);
    }

    @Test
    public void test_Process_Roman_III() {
        var component = new RomanNumeralProcessor();
        var result = component.process("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test_Process_Roman_V() {
        var component = new RomanNumeralProcessor();
        var result = component.process("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void test_Process_Roman_X() {
        var component = new RomanNumeralProcessor();
        var result = component.process("X");
        Assert.assertEquals(10, result);
    }

    @Test
    public void test_Process_Roman_IV(){
        var result = new RomanNumeralProcessor().process("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void test_Process_Roman_XCI(){
        //XC - minus
        //XI - plus
        var result = new RomanNumeralProcessor().process("XCI");
        Assert.assertEquals(91, result);
    }

    @Test
    public void test_Process_Roman_XC(){
        var result = new RomanNumeralProcessor().process("XC");
        Assert.assertEquals(90, result);
    }
}
