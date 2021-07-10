package com.skaribandi.promotion_calculator.util;

import java.util.Comparator;

import com.skaribandi.promotion_calculator.model.Product;

public class ProductComparator implements Comparator<Product> {
	


public int compare(Product o1, Product o2) {
	if(o1.getPrice() > o2.getPrice()) return 1;
	if(o1.getPrice() < o2.getPrice()) return -1;
	return 0;
}

}
