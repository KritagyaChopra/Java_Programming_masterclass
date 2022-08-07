package com.company;

public class Main {

    public static void main(String[] args) {
		byte myByteValue = 5 ;
		int myIntValue = 5 ;
		short myShortValue = 5 ;
		long myLongValue = 50000 + 10 *( myByteValue + myIntValue + myShortValue );
		System.out.println(myLongValue);
	}
}
