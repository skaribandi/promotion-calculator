package com.skaribandi.promotion_calculator.promotion;

import java.util.List;

import com.skaribandi.promotion_calculator.model.Cart;
import com.skaribandi.promotion_calculator.model.CartItem;
import com.skaribandi.promotion_calculator.model.Product;
import com.skaribandi.promotion_calculator.util.CartUtil;

/**
 * 
 * @author skaribandi One of the implementation for the Promotion
 *
 */
public class CheapestItemFreePromotion implements Promotion {

	public double apply(Cart cart, List<String> discountedProdcts) {
		// Does cart has 3 products from the product A,B,C,D,E

		int discountedItemNameCount = 0;
		for (CartItem item : cart.getCartItems()) {
			if (item.getProduct().getName() == "A" || item.getProduct().getName() == "B"
					|| item.getProduct().getName() == "C" || item.getProduct().getName() == "D"
					|| item.getProduct().getName() == "E") {
				discountedItemNameCount++;
			}
		}
		double totalPrice = 0;
		double discountprice = 0;
		if (discountedItemNameCount >= 3) {
			// find the low price item
			Product product = CartUtil.findLowestPricedItem(cart, discountedProdcts);
			// calculate the discount amount
			if (product != null) {
				CartItem item = cart.getCartItemByProductName(product.getName());
				discountprice = item.getQuantity() * product.getPrice();
			}
		}

		// calculate the price and exclude the discounted price
		for (CartItem cartItem : cart.getCartItems()) {
			totalPrice = totalPrice + cartItem.getQuantity() * cartItem.getProduct().getPrice();
		}

		return totalPrice - discountprice;
	}

}
