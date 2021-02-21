package Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Products.Products;


/**
 * 
 * @author Dhivya
 *
 */
public class ProductListIO {

	public static ArrayList<Products> readProductList(String fileName) throws FileNotFoundException {
		Scanner fileReader = new Scanner(new FileInputStream(fileName));  
		ArrayList<Products> productList = new ArrayList<Products>();; 
	   
	    while (fileReader.hasNextLine()) { 
	       
	    	String newProduct = fileReader.next();
			Products newProductItem = new Products(newProduct);
			
			productList.add(newProductItem);
	       
	    }
	   
	    fileReader.close();
	    
	    return productList;
	}
	
}
