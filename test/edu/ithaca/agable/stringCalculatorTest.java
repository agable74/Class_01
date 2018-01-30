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

        String twoStringPosPos = "1,1";
        String twoStringPosNeg = "1,-1";
        String twoStringNegPos = "-1,1";
        String twoStringNegNeg = "-1,-1";

        assertEquals(2,myStringCalculator.Add(twoStringPosPos),"Does not add two positives");
        assertEquals(0,myStringCalculator.Add(twoStringPosNeg),"Does not add positive then negative");
        assertEquals(0,myStringCalculator.Add(twoStringNegPos),"Does not add negative then positive");
        assertEquals(-2,myStringCalculator.Add(twoStringNegNeg),"Does not add two negatives");

    }

}