package org.hbrs.se1.ws25.exercises.uebung1.control;

public class Fabric {
    public static Translator fabricate(){
        return new GermanTranslator();
    }    
}
