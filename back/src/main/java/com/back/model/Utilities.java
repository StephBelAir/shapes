package com.back.model;

public class Utilities {

    public static Utilities _newLine = new Utilities();
    public static final String newLine=System.lineSeparator();


    private Utilities(){
    }

    public static Utilities getNewLine(){
        return _newLine;
    }
}
