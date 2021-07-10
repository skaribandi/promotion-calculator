package com.skaribandi.promotion_calculator.promotion;

import java.util.List;

import com.skaribandi.promotion_calculator.model.Cart;
import com.skaribandi.promotion_calculator.model.CartItem;

/**
 * 
 * @author skaribandi
 * One of the implementation for the Promotion
 *
 */
public class HalfPricePromotion implements Promotion{
	
	public double apply(Cart cart, List<String> discountedProdcts) {
		//Does cart has Product A & B 
		// If Yes for Each of product of A the price of Product will be half 
		double  totalPrice =0;
		double discountprice =0;
		CartItem itemA  = cart.getCartItemByProductName("A");
		CartItem itemB  = cart.getCartItemByProductName("B");
		int discountItemBCount = 0;
		if(itemA != null  && itemB != null) {
			//get number of items of A 
			int itemASize = itemA.getQuantity();
			//get number of items of B
			discountItemBCount = itemB.getQuantity() - itemASize ;
			
			discountprice = itemB.getProduct().getPrice() * discountItemBCount * 0.5;
			
		} 
		
		//calculate the price and exclude the discounted price  
		for(CartItem cartItem  : cart.getCartItems()) {
			totalPrice = totalPrice + cartItem.getQuantity() *  cartItem.getProduct().getPrice() ;
		}
		
		return totalPrice - discountprice;
	}

}
