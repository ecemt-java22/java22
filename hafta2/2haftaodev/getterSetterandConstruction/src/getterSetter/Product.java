package getterSetter;

public class Product {
	public Product(int id, String name, String description, double price) {
		//constructor
		System.out.println("Yapıcı blok calıstı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
	}
	
	
	
	//attribute | field
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;
	
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		//_id=id;
		this.id=id;
		//bulundugum classın idsi
		
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	private String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		
		return this.name.substring(0,1) + id;
		//kullanıcını yazması engellendi
	}

	private void setKod(String kod) {
		this.kod = kod;
	}

	

}
