package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkPasswordLength_shouldReturnTrue_whenCalledWith8Chars(){
      //GIVEN
        boolean expected = true;
      //WHEN
        boolean actual = Main.checkPasswordLength("Test1234");
      //THEN
      assertEquals(expected,actual);
    }

    @Test
    void checkPasswordLength_shouldReturnFalse_whenCalledWith7Chars(){
        //GIVEN
        boolean expected = false;
        //WHEN
        boolean actual = Main.checkPasswordLength("Test123");
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void checkPasswordLength_shouldReturnTrue_whenCalledWith10Chars(){
        //GIVEN
        boolean expected = true;
        //WHEN
        boolean actual = Main.checkPasswordLength("Test123456");
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void checkPasswordDigits_shouldReturnTrue_whenCalledWithDigits(){
        boolean expected = true;
        boolean actual = Main.checkPasswordDigits("Test1234");
        assertEquals(expected,actual);
    }
    @Test
    void checkPasswordDigits_shouldReturnFalse_whenCalledWithoutDigits(){
        boolean expected = false;
        boolean actual = Main.checkPasswordDigits("TestTest");
        assertEquals(expected,actual);
    }
    @Test
    void checkPasswordCases_shouldReturnTrue_whenCalledWithUppercaseDigits(){}
}