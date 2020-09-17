package com.examples.example2;

import com.examples.interfaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Mahindra";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 340000;
	}

}
