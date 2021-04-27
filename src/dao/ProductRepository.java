package dao;

import java.util.ArrayList;

import dto.Product;

/*자바빈즈로 사용할 상품 데이터 접근 클래스 만들기*/
public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	/*객체 변수 instance에 대한 Getter() 메서드*/
	public static ProductRepository getInstance() {
		return instance;
	}

	public ProductRepository() {
		
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, 8-megapixel iSignt Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC gram", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core Processors");
		notebook.setCategory("NoteBook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8 * 125.6 * 6.6 mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	/*상품 상세정보를 가져오는 메서드*/
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product =listOfProducts.get(i);
			if((product != null) && (product.getProductId() != null) && (product.getProductId().equals(productId))) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	/*신규 상품 데이터를 저장하는 메서드*/
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
