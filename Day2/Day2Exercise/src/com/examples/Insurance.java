package com.examples;

public class Insurance {

		private int policyNumber;
		private String policyHolderName;
		private int policyHolderAge;
		private double insuredAmount;
		
		public Insurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
			super();
			this.policyNumber = policyNumber;
			this.policyHolderName = policyHolderName;
			this.policyHolderAge = policyHolderAge;
			insuredAmount = insuredAmount;
		}

		public Insurance() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @return the policyNumber
		 */
		public int getPolicyNumber() {
			return policyNumber;
		}

		/**
		 * @param policyNumber the policyNumber to set
		 */
		public void setPolicyNumber(int policyNumber) {
			this.policyNumber = policyNumber;
		}

		/**
		 * @return the policyHolderName
		 */
		public String getPolicyHolderName() {
			return policyHolderName;
		}

		/**
		 * @param policyHolderName the policyHolderName to set
		 */
		public void setPolicyHolderName(String policyHolderName) {
			this.policyHolderName = policyHolderName;
		}

		/**
		 * @return the policyHolderAge
		 */
		public int getPolicyHolderAge() {
			return policyHolderAge;
		}

		/**
		 * @param policyHolderAge the policyHolderAge to set
		 */
		public void setPolicyHolderAge(int policyHolderAge) {
			this.policyHolderAge = policyHolderAge;
		}

		/**
		 * @return the insuredAmount
		 */
		public double getInsuredAmount() {
			return insuredAmount;
		}

		@Override
		public String toString() {
			return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName
					+ ", policyHolderAge=" + policyHolderAge + ", insuredAmount=" + insuredAmount + "]";
		}

		/**
		 * @param insuredAmount the insuredAmount to set
		 */
		public void setInsuredAmount(double insuredAmount) {
			insuredAmount = insuredAmount;
		}
		
		public double calculatePremium() {
			double premium;
			if(this.getPolicyHolderAge() <25 )
			{
				 premium= this.getInsuredAmount()*0.6+this.getInsuredAmount();
			}
			else {
				
			premium= this.getInsuredAmount()*0.7+this.getInsuredAmount();
			}
			
			return premium;
		}
}
