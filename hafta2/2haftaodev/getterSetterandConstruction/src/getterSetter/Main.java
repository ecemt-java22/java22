package getterSetter;

public class Main {

	public static void main(String[] args) {
		//construction
		Product product= new Product(1,"Laptop","Apple Laptop",25000);
		
		
		//get-set
		
//		System.out.println("****************");
//		product.setId(1);
//		product.setName("Laptop");
//		product.description="Apple Laptop";
//		product.price=5000;
//		product.stockAmount=7;
//		product.renk="";
//		System.out.println("*****************************");
//		product.getId();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Apple Laptop");
//		product.setPrice(25.000);
//		product.setStockAmount(5);
		
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

	}

}
