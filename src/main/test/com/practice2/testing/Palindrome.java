package com.practice2.testing;


import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome {


     CheckStringPal  palindromeChecker = new CheckStringPal();

    @Test
    public void palindromeCheckTest1() throws Exception{

        String expectedValue = "Not a Palindrome";


        String actualValue = palindromeChecker.checkString("london");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeCheckTest2() throws Exception{

        String expectedValue = "Palindrome";

        String actualValue = palindromeChecker.checkString("lolol");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void palindromeCheckTest3() throws Exception{

        String expectedValue = "Not a Valid String";

        String actualValue = palindromeChecker.checkString(null);

        assertEquals(expectedValue, actualValue);
    }
}
