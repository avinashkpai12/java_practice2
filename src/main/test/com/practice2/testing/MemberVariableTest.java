package com.practice2.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable = new MemberVariable();
    Member member = new Member();
    @Test
    public void getName() {
        String expectedValue = "Avinash";
        member.setName("Aviansh");
        assertEquals(expectedValue, memberVariable.getName(member));
    }

    @Test
    public void getAge() {
        int expectedValue = 25;
        member.setAge(25);
        assertEquals(expectedValue, memberVariable.getAge(member));
    }

    @Test
    public void getSalary() {
        double expectedValue = 60000.0;
        member.setSalary(60000.0);
        assertEquals(expectedValue, memberVariable.getSalary(member));
    }
}
