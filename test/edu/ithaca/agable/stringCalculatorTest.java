package edu.ithaca.agable;


import static org.junit.jupiter.api.Assertions.assertEquals;

class stringCalculatorTest {

    stringCalculator myStringCalculator = new stringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void testAdd(){
        String emptyString = "";
        assertEquals(0,myStringCalculator.Add(emptyString),"Does not properly work with empty string");


    }

}