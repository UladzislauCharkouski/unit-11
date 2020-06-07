package com.epam.unit11.Task01;

public class PaymentOperator {
	public static void main(String[] args){
		Payment buy = new Payment();
		Product meat = new Product("Meat", 1);
		Product milk = new Product("Milk", 2);
		Product bread = new Product("Bread", 3);
		buy.add(meat);
		buy.add(milk);
		buy.add(bread);
		System.out.println(buy);
		System.out.println();
		Product findProduct = buy.findByName("Milk");
		if(findProduct != null){
			System.out.println(findProduct);
		}
		System.out.println();
		buy.delete(milk);
		System.out.println(buy);
	}
	
}
