package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue=10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("min int value " + myMinIntValue);
        System.out.println("max int value " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("min byte value " + myMinByteValue);
        System.out.println("max byte value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("min short value " + myMinShortValue);
        System.out.println("max short value " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("min long value " + myMinLongValue);
        System.out.println("max long value " + myMaxLongValue);

        byte myByteUniqueValue = (byte) 202390392;
        System.out.println(myByteUniqueValue);
    }
}
