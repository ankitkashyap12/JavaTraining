package com.examples;

public class VehicleInsurance extends Insurance {
	private String vehicleModel;
	private int yearOfManufacture;
	private int costOfVehicle;
	
	
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		// TODO Auto-generated constructor stub
	}
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount,
			String vehicleModel, int yearOfManufacture, int costOfVehicle) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}

	/**
	 * @return the vehicleModel
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}

	/**
	 * @param vehicleModel the vehicleModel to set
	 */
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	/**
	 * @return the yearOfManufacture
	 */
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	/**
	 * @param yearOfManufacture the yearOfManufacture to set
	 */
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	/**
	 * @return the costOfVehicle
	 */
	public int getCostOfVehicle() {
		return costOfVehicle;
	}

	/**
	 * @param costOfVehicle the costOfVehicle to set
	 */
	public void setCostOfVehicle(int costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium;
		if (this.vehicleModel.equals("Two Wheeler"))
		{
			
			if (2020-this.yearOfManufacture < 2 ) {
				premium=this.costOfVehicle*0.6;	
			}
			
			else {
				premium=this.costOfVehicle*0.5;
			}
		
		}
		
		else {
			
			if (2020-this.yearOfManufacture < 2 ) {
				premium=this.costOfVehicle*0.6;	
			}
			else {
				premium=this.costOfVehicle*0.5;
			}
		}
		return premium;
	}
	
	
	
	
}
