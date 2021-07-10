package com.skaribandi.promotion_calculator.model;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author skaribandi
 * User item holder , will add the items to this cart 
 *
 */
public class Cart {
	
	private List<CartItem> cartItems ;

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	public void addCartItems(CartItem item ) {
		//initilise the cart 
		if(cartItems == null ) {
			cartItems =  new ArrayList<CartItem>();
		}
		cartItems.add(item);
	}
	
	//Can util method to remove the cartitem 
	

}
