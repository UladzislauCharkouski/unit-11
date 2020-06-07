package com.epam.unit11.Task01;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private List<Product> products = new ArrayList<Product>();
	
	public Payment() {
	}
	
	public List<Product> getNotes(){
	return products;
	}
	
	public void add(Product product){
		products.add(product);
	}
	
	public boolean delete(Product product){
		return products.remove(product);
	}
	
	public Product findByName(String name){
		for(Product product : products){
			if (product.getName().equals(name)){
				return product;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [products=" + products + "]";
	}
}
