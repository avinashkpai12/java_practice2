package com.practice2.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    private EvenNum evenNum = new EvenNum();
    @Test
    public void isEven() {
        assertTrue(evenNum.isEven(6));
    }
    @Test
    public void isNotEven(){
        assertFalse(evenNum.isEven(7));
    }
    @Test
    public void isNotNull(){
        assertNotNull(evenNum.isEven(8));
    }
}
