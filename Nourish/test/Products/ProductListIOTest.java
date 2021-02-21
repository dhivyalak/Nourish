package Products;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Test;

import Reader.ProductListIO;


/**
 * 
 * @author Dhivya
 *
 */
public class ProductListIOTest {

	/** Valid product list */
	private final String validTestFile = "test-files/ProductList.txt";
	
	
	@Test
	public void testReadProductList() {
		try {
			ArrayList<Products> productList = ProductListIO.readProductList(validTestFile);
			assertEquals(18, productList.size());
			
			
		} catch (FileNotFoundException e) {
			fail("Unexpected error reading " + validTestFile);
		}
	}

}
