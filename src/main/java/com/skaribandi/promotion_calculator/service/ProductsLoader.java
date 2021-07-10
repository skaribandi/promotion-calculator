package com.skaribandi.promotion_calculator.service;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skaribandi.promotion_calculator.model.Product;

/**
 * 
 * @author skaribandi
 * 
 * Class  to read the product configuration from the file
 *
 */
public class ProductsLoader {
	
	public static List<Product> getProdctList(String fileDir) {
		
		List<Product>  productList = new ArrayList<Product> ();
		
		Scanner scanner = new Scanner(getFileInputStream(fileDir));
        scanner.useDelimiter("\r?\n");
        while (scanner.hasNext()) {
            //Assuming that all input line data is accurate not added any validation for input data 
        	String[] productInfo = scanner.next().split(",") ; 
        	productList.add(new Product(productInfo[0],new Double(productInfo[1]))) ; 
        }
		
		return productList;
	}
	private static InputStream getFileInputStream(String fileDir) {
        

        try {
            return new DataInputStream(new FileInputStream(new File(fileDir)));
        } catch (FileNotFoundException e) {
            System.err.println("Could not find file: " + fileDir);
        }
        return null;
    }
}
