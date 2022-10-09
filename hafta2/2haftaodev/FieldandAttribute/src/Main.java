
public class Main {

	public static void main(String[] args) {
		Product product= new Product();
		product.id=1;
		product.name="Laptop";
		product.description="Apple Laptop";
		product.price=5000;
		product.stockAmount=7;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//System.out.println(product.name);


	}

}
