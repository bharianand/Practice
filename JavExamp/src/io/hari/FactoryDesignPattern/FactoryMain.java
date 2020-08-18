package io.hari.FactoryDesignPattern;

import io.hari.FactoryDeisgnPatternImp.OS;
import io.hari.FactoryDeisgnPatternImp.OperatingSystemFactory;
import io.hari.FactoryDeisgnPatternImp.Windows;

public class FactoryMain {
	public static void main(String[] ar){
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getOsInstance("Android");
		os.spec();
	}
}
