package com.skaribandi.promotion_calculator.promotion;



import java.util.ArrayList;
import java.util.List;

import com.skaribandi.promotion_calculator.model.Cart;
import com.skaribandi.promotion_calculator.model.CartItem;
import com.skaribandi.promotion_calculator.model.Product;

import junit.framework.TestCase;

public class CheapestItemFreePromotionTest extends TestCase {

	 public void testApply() {
		 CheapestItemFreePromotion halfPricePromotion = new CheapestItemFreePromotion();
		  
		  Cart cart = new Cart();
		  
		  CartItem cartItemA = new CartItem();
		  cart.addCartItem(cartItemA);
		  Product productA = new Product("A", 10.0);
		  cartItemA.setProduct(productA);
		  cartItemA.setQuantity(1);
		  
		  CartItem cartItemB = new CartItem();
		  cart.addCartItem(cartItemB);
		  Product productB = new Product("B", 5.0);
		  cartItemB.setProduct(productB);
		  cartItemB.setQuantity(1);
		  
		  
		  CartItem cartItemC = new CartItem();
		  cart.addCartItem(cartItemC);
		  Product productC = new Product("C", 4.0);
		  cartItemC.setProduct(productC);
		  cartItemC.setQuantity(1);
		  

		  CartItem cartItemF = new CartItem();
		  cart.addCartItem(cartItemF);
		  Product productF = new Product("F", 2.0);
		  cartItemF.setProduct(productF);
		  cartItemF.setQuantity(1);
		  
		  
		  List<String> discountedProducts = new ArrayList<String>();
		  //We cab add hasDiscount field to the Product
		  discountedProducts.add("A");
		  discountedProducts.add("B");
		  discountedProducts.add("C");
		  discountedProducts.add("D");
		  discountedProducts.add("E");
		  
		  double totalAmount = halfPricePromotion.apply(cart , discountedProducts);
		  assertEquals(17.0, totalAmount);
	  }
}
