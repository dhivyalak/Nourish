package Products;

public class Products {
	

	private String productItem;
	
	public Products(String productItem) {
		setProductItem(productItem);
	}
	
	public void setProductItem (String productItem) {
		
	}
	
	public String getProductItem (String productItem) {
		return productItem;
		
	}
	
	@Override
	public String toString() {
		return productItem + " has been added to cart!";
	}

}
