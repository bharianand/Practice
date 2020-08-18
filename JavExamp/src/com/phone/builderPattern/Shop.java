package com.phone.builderPattern;

public class Shop {
	public static void main(String ar[]){
		// Phone p = new PhoneBuilder().setOs("Android").setProcessor("Qualcomm").setBattery(3100).getPhone();
		Phone p = new PhoneBuilder().setBattery(3100).getPhone();
		System.out.println(p);
	}
}
