import ClassCredit.Customer;

public class Main {

	public static void main(String[] args) {
//		int sayi1= 10;
//		int sayi2 =20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		System.out.println(sayi1);
//		System.out.println("*****************************");
		
//		int[] sayilar1 = new[] {1,2,3};
//		int[] sayilar2= new[] {10,20,30};
//		sayilar1 = sayilar2;
//		sayilar2[0] =100;
//		
//		System.out.println(sayilar1[0]);
		
		
	//CreditManager creditManager=new CreditManager();
//		creditManager.Hesapla();
//		creditManager.Calculate();
//		creditManager.Save();
//		System.out.println(creditManager);
		
		
			
		Customer customer= new Customer();
		customer.Id=1;
		customer.name= "Engin";
		customer.lastname="Demiroğ";
		customer.NatioanlIdentity="1119";
		System.out.println(customer.Id);
		
		CustomerManager customerManager= new CustomerManager(customer);
		//customerManager.Save(1, "Engin", "Demiroğ", "1119");
		//CustomerManager.Save(customer);
		CustomerManager.Save();
		
	}
	
	
//	public class CreditManager {
//		public void Hesapla() {
//			System.out.println("Hesaplandı");
//		}
//		public void Save() {
//			System.out.println("Kredi verildi");
//		}
//		
//		public void Calculate() {
//			System.out.println("Hesaplandı");
//		}
//		
//	}
	
	public class Customer{
		public int Id;
		
		private String name;
		 
	    // Method 1 - Getter
	    public String getName() { return name; }
	 
	    // Method 2 - Setter
	    public void setName(String N)
	    {
	 
	        // This keyword refers to current instance itself
	        this.name = N;
	    }
	    
	    private String lastname;
	    
	    public String getLName() {return lastname;}
	    public void setLName(String LN) {
	    	this.lastname=LN;
	    }
		
		private String NatioanlIdentity;
		public String getNIdentity() {return NatioanlIdentity;}
		public void setNIdentity(String NI) {
			this.NatioanlIdentity= NI;
		}
		
	}
	
	public class CustomerManager{
		private Customer _customer;
		public CustomerManager(Customer customer) {
			_customer= customer;
		}
		
		//Katmanlı Mimariler
		public void Save() {
			System.out.println("Müşteri kaydedildi : " + _customer.FirstName);
		}
	}
		

}
