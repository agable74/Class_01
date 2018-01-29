package edu.ithaca.agable;


import static org.junit.jupiter.api.Assertions.assertEquals;

class stringCalculatorTest {

    stringCalculator myStringCalculator = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void testAdd(){
        String emptyString = "";
        assertEquals(0,myStringCalculator.Add(emptyString),"Does not properly work with empty string");

        String oneStringPos = "1";
        String oneStringNeg = "-1";
        String oneStringZero = "0";

        assertEquals(1,myStringCalculator.Add(oneStringPos),"Does not add single positive value");
        assertEquals(-1,myStringCalculator.Add(oneStringNeg),"Does not add single negative value");
        assertEquals(0,myStringCalculator.Add(oneStringZero),"Does not add single zero value");

    }

}