package com.skaribandi.promotion_calculator.promotion;

import com.skaribandi.promotion_calculator.model.Cart;

/**
 * 
 * @author skaribandi
 *interface for the Promotion
 */
public interface Promotion {
	public double apply(Cart cart);
}
