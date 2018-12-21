package com.practice2.testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Marks {

    private ClassMarks studentEvaluation = new ClassMarks();
    @Test
    public void average() {
        String expected = "The average is 81.5";
        int[] grades = {86, 65, 98, 77};
        String actual = studentEvaluation.average(grades);
        assertEquals(expected, actual);

    }

    @Test
    public void minimum() {
        String expected = "The minimum is 65";
        int[] grades = {86, 65, 98, 77};
        String actual = studentEvaluation.minimum(grades);
        assertEquals(expected, actual);
    }

    @Test
    public void maximum() {
        String expected = "The maximum is 98";
        int[] grades = {86, 65, 98, 77};
        String actual = studentEvaluation.maximum(grades);
        assertEquals(expected, actual);
    }
}
