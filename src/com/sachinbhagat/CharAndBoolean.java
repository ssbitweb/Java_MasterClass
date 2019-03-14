package com.sachinbhagat;

public class CharAndBoolean {

    public static void main(String[] args) {
        //width of char is 16 (2byte)
        char myChar = 'A';
        char myUniCodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUniCodeChar);

        boolean myBoolean = true;

        char register_symbol = '\u00AE';
        System.out.println(register_symbol);
    }
}
