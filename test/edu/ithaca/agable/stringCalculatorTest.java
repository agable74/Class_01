package edu.ithaca.agable;


import static org.junit.jupiter.api.Assertions.*;

class stringCalculatorTest {

    stringCalculator myStringCalculator = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void testAdd(){
        String emptyString = "";
        assertEquals(0,myStringCalculator.Add(emptyString),"Does not properly work with empty string");

        String oneStringPos = "1";
        String oneStringNeg = "-1";
        String oneStringZero = "0";
        String oneStringLong = "-100000";

        assertEquals(1,myStringCalculator.Add(oneStringPos),"Does not add single positive value");
        assertEquals(-1,myStringCalculator.Add(oneStringNeg),"Does not add single negative value");
        assertEquals(0,myStringCalculator.Add(oneStringZero),"Does not add single zero value");
        assertEquals(-100000,myStringCalculator.Add(oneStringLong),"Does not add single long string");

        String twoStringPosPos = "1,1";
        String twoStringPosNeg = "1,-1";
        String twoStringNegPos = "-1,1";
        String twoStringNegNeg = "-1,-1";

        assertEquals(2,myStringCalculator.Add(twoStringPosPos),"Does not add two positives");
        assertEquals(0,myStringCalculator.Add(twoStringPosNeg),"Does not add positive then negative");
        assertEquals(0,myStringCalculator.Add(twoStringNegPos),"Does not add negative then positive");
        assertEquals(-2,myStringCalculator.Add(twoStringNegNeg),"Does not add two negatives");

        String threeStringAllNeg = "-1,-1,-1";
        String threeStringMix = "-1,1,-1";
        String threeStringAltMix = "1,-1,1";
        String tenStringMix = "-1,1,-1,1,-1,1,-1,-1,-1,1";
        String tenStringLarge = "-100,100,-100,100,-100,100,-100,-100,-100,100";

        assertEquals(-3,myStringCalculator.Add(threeStringAllNeg),"Does not add all negatives");
        assertEquals(-1,myStringCalculator.Add(threeStringMix),"Does not add mix");
        assertEquals(1,myStringCalculator.Add(threeStringAltMix),"Does not add alt mix");
        assertEquals(-2,myStringCalculator.Add(tenStringMix),"Does not add ten mix");
        assertEquals(-200,myStringCalculator.Add(tenStringLarge),"Does not add ten large");

        String newLineTwo = "-1\n1";
        String newLineThreeMix = "-1,1\n1";
        String newLineThree = "-1\n-1\n-1";
        String newLineThreeMixAlt = "-1\n1,1";
        String newLineThreeMixAlt2 = "-1\n1,1,1";

        assertEquals(0,myStringCalculator.Add(newLineTwo),"Does not add with newline");
        assertEquals(1,myStringCalculator.Add(newLineThreeMix),"Does not add newline mix");
        assertEquals(-3,myStringCalculator.Add(newLineThree),"Does not add all newlines");
        assertEquals(1,myStringCalculator.Add(newLineThreeMixAlt),"Does not add newline alt mix");
        assertEquals(2,myStringCalculator.Add(newLineThreeMixAlt2),"Does not add newline alt mix");
    }

}