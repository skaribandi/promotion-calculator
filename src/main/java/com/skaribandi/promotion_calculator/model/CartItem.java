package com.skaribandi.promotion_calculator.model;
/**
 * 
 * @author skaribandi
 * 
 * Class to hold the cart item that user selected 
 *
 */
public class CartItem {
private Product product ;
private int quantity ;

//Can be added util methods to increase or reduce the quantity 

public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
