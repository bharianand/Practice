package com.phone.builderPattern;

public class Sony extends Company{

	private final int price = 20;
	private final String pack = "SonyCD";
	
	@Override
	public int price() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return pack;
	}

}
