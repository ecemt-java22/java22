package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı Blok Çalıştı");
	}
	
	
	
//	public ProductValidator() {
//		System.out.println("Yapıcı blok çalıştı");
//	}
	//newleyince calısır
	
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;			
		}else {
			return false;
		}
		
	}
	public void birsey() {
		
	}
	
//	public static class BaskaBirClass() {
//		public static void delete() {
//			//inner class
//		}
//	}

}
