package com.examples.example2;

import com.examples.interfaces.Automobile;

public class Bike implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Apache";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "RED";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 150000;
	}

}
