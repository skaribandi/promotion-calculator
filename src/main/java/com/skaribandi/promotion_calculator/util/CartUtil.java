package com.skaribandi.promotion_calculator.util;

import java.util.ArrayList;
import java.util.List;

import com.skaribandi.promotion_calculator.model.Cart;
import com.skaribandi.promotion_calculator.model.CartItem;
import com.skaribandi.promotion_calculator.model.Product;
/**
 * 
 * @author skaribandi
 * Cart util to provide the lowest price item and other util methods 
 *
 */
public class CartUtil {
	
	public static Product findLowestPricedItem(Cart cart , List<String> promotionProducts) {
		
		List<Product> products = new ArrayList<Product>();
		
		for(CartItem item : cart.getCartItems()) {
			if(promotionProducts.contains(item.getProduct().getName()) ) {
				products.add(item.getProduct());
			}
		}
		
		products.sort(new ProductComparator());
		
		
		return products.get(0) ;
	}
}
