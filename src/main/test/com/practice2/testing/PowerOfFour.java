package com.practice2.testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFour {


    @Test
    public void powerOfFourCheck1() throws Exception{

        String excpectedValue = "Power Of Four";

        PowerOfFourCheck pof = new PowerOfFourCheck();

        String actualValue = pof.checkIf(64);

        assertEquals(excpectedValue, actualValue);
    }

    @Test
    public void powerOfFourCheck2() throws Exception{

        String excpectedValue = " Not a Power Of Four";

        PowerOfFourCheck pof = new PowerOfFourCheck();

        String actualValue = pof.checkIf(64);

        assertEquals(excpectedValue, actualValue);
    }

    @Test
    public void powerOfFourCheck3() throws Exception{

        String excpectedValue = "Please enter a positive integer";

        PowerOfFourCheck pof = new PowerOfFourCheck();

        String actualValue = pof.checkIf(64);

        assertEquals(excpectedValue, actualValue);
    }

}
