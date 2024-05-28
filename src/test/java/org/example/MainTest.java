package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkPasswordLength_shouldReturnTrue_whenCalledWith8Chars(){
      //GIVEN
        boolean expected = true
      //WHEN
        boolean actual = checkPasswordLength.lengthTest(8)
      //THEN
      assertEquals(expected,actual);
    }

    @Test
    void checkPasswordLength_shouldReturnFalse_whenCalledWith7Chars(){
        //GIVEN
        boolean expected = false
        //WHEN
        boolean actual = checkPasswordLength.lengthTest(7)
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void checkPasswordLength_shouldReturnTrue_whenCalledWith10Chars(){
        //GIVEN
        boolean expected = true
        //WHEN
        boolean actual = checkPasswordLength.lengthTest(10)
        //THEN
        assertEquals(expected,actual);
    }

}