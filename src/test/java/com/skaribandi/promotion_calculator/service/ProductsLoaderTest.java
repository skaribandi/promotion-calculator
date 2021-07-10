package com.skaribandi.promotion_calculator.service;



import java.util.List;

import com.skaribandi.promotion_calculator.model.Product;

import junit.framework.TestCase;

public class ProductsLoaderTest extends TestCase {

 
  public void testProdctLoad() {
	  List<Product> products =  ProductsLoader.getProdctList("/Users/skaribandi/promotion-calculator/src/main/resource/CheapestItemFreePromotionProductList.txt"); 
	  assertEquals( products.size() , 6 );
	  
	  assertEquals(products.get(0).getName() , "A");
  }
}
