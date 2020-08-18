package io.hari.BuilderDesignPatternPack;

import io.hari.BuilderDesignPatternImpPack.Phone;

public class BuilderPatternMainPrg {
	public static void main(){
		Phone p = new Phone("Android", 2, "sony", (float) 5.5, 3000);
		p.toString();
	}
}
