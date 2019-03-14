package com.sachinbhagat;

public class ByteShortInt {

    public static void main(String[] args) {

        // int has width of 32
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;

        int myNewIntValue = (myMinIntValue /2);
        System.out.println("myNewIntValue =" + myNewIntValue);

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println("myNewShortValue =" + myNewShortValue);


        // long has width of 64
        long MyMinLongValue = -9_223_372_036_854_775_808L;
        long MyMaxLongValue = 9_223_372_036_854_775_807L;

        long myNewLongValue = (long) (MyMinLongValue/2);
        System.out.println("MyNewLongValue = "+ myNewLongValue);
    }


}
