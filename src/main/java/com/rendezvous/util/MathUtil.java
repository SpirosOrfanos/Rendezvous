package com.rendezvous.util;

public class MathUtil {
	
	public static double calculateOffer(double price, double percentage) {
		return price - (percentage/100)*price;
	}

}
