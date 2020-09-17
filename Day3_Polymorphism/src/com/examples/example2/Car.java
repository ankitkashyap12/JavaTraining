package com.examples.example2;

import com.examples.interfaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i5";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000;
	}

}
