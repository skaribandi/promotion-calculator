package com.skaribandi.promotion_calculator.promotion;

import java.util.List;

import com.skaribandi.promotion_calculator.model.Cart;

/**
 * 
 * @author skaribandi
 *interface for the Promotion
 */
public interface Promotion {
	public double apply(Cart cart, List<String> discountedProdcts);
}
