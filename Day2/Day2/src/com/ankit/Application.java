package com.ankit;

public class Application {
	public static void main(String[] args) {
		Product tv=new Product("LG", 15000.00, 101,1,3,0.45);
		ManageProduct mgr =new ManageProduct();
//		double discount=mgr.CalculateDiscount(tv);
//		System.out.println("Discount : "+discount);
		Product fridge=new Product("samsung fridge", 45000.00, 151,7,2,0.45);
		
		double tax= mgr.showTax(tv);
//		System.out.println("Tax is : "+ tax);
		Product[] productList=new Product[2];
		productList[0]=tv;
		productList[1]=fridge;
		mgr.showProductForEach(productList);
		mgr.showProducts(productList);
		mgr.calculateDiscountList(productList);
		for (int j=0;j<productList.length;j++)
		{
			double amount_before_discount=productList[j].getQuantity()*productList[j].getRatePerUnit();
			double amount=amount_before_discount-amount_before_discount*0.05;
			System.out.println("Product name: "+productList[j].getProductName()+ "  product quantity: "+ productList[j].getQuantity());
			System.out.println("Discount is: "+productList[j].getDiscount()+" Total amount : "+amount+"\n");
		}
		
	}
}
