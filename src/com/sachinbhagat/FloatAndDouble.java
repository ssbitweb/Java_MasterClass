package com.sachinbhagat;

public class FloatAndDouble {

    public static void main(String[] args) {
        //width of int is 32 bit (4byte)
        int myIntValue = 5/3;
        // width of float is 32 (4byte)
        float myFloatValue = 5f/3f;
        //width of double is 64 bit (8byte)
        double myDoubleValue = 5d/3d;

        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);



        int myPounds = 200;
        double kg = 0.45359237d;
        double poundToKg = myPounds * kg;
        System.out.println("the 200 pound to KG is :" + poundToKg +"KG");
    }
}
