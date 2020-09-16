package com.ankit;

public class ManageProduct {

	public double CalculateDiscount(Product product) {
		double discount=0.0;
		if (product.getRatePerUnit()>500&& product.getRatePerUnit()<=1000) {
			discount=0.1;
		}
		else if (product.getRatePerUnit() >1000) {
			discount=0.45;
		}
		return discount;
	}
	
	public double showTax(Product product) {
		int productType= product.getProductType();
		double tax;
		switch(productType) {
		case(1):
			tax=0.05;
			break;
		case (2):
			tax=0.1;
			break;
		case(3):
			tax=0.15;
			break;
		default:
			tax=0.35;
		
		}
		return tax;
	}
	
	public void showProductForEach(Product[] productList)
	{
		for(Product eachProduct:productList) {
			System.out.println(eachProduct.getProductName()+"-"+eachProduct.getRatePerUnit());
		}
	}
	
	
	public Product[] calculateDiscountList(Product[] productList) {
		for(int i=0;i<productList.length;i++) {
		if (productList[i].getRatePerUnit()>500 && productList[i].getRatePerUnit()<=1000) {
			productList[i].setDiscount(0.05);
		}
		else if (productList[i].getRatePerUnit() >1000) {
			productList[i].setDiscount(0.45);
		}
		}
		return productList;
	}
	
	public void showProducts(Product[] productList) {
		for(int i=0;i<productList.length;i++)
		{
			System.out.println("Product:"+productList[i].getProductName());
		}
		
	}
}
	
