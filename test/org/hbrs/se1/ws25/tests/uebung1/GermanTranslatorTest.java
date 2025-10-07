package org.hbrs.se1.ws25.tests.uebung1;

import org.hbrs.se1.ws25.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

  
    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        //positiv test cases:
        assertEquals("eins" , translator.translateNumber(1));
        assertEquals("zehn" , translator.translateNumber(10));
        assertEquals("fünf" , translator.translateNumber(5));

        //negative test cases:
        assertEquals("Übersetzung der Zahl 11 nicht möglich (1.0)" , translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 0 nicht möglich (1.0)" , translator.translateNumber(0));
        assertEquals("Übersetzung der Zahl -5 nicht möglich (1.0)" , translator.translateNumber(-5));
        
    }

}