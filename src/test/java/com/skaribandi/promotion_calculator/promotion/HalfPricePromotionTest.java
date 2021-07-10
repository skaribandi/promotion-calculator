package com.skaribandi.promotion_calculator.promotion;



import com.skaribandi.promotion_calculator.model.Cart;
import com.skaribandi.promotion_calculator.model.CartItem;
import com.skaribandi.promotion_calculator.model.Product;

import junit.framework.TestCase;

public class HalfPricePromotionTest extends TestCase {

 
  public void testApply() {
	  HalfPricePromotion halfPricePromotion = new HalfPricePromotion();
	  
	  Cart cart = new Cart();
	  
	  CartItem cartItemA = new CartItem();
	  cart.addCartItem(cartItemA);
	  Product productA = new Product("A", 10.0);
	  cartItemA.setProduct(productA);
	  cartItemA.setQuantity(1);
	  CartItem cartItemB = new CartItem();
	  cart.addCartItem(cartItemB);
	  Product productB = new Product("B", 9.0);
	  cartItemB.setProduct(productB);
	  cartItemB.setQuantity(2);
	  
	  double totalAmount = halfPricePromotion.apply(cart);
	  assertEquals(23.5, totalAmount);
  }
}
