
public class ClassCredit {

	public static void main(String[] args) {
//		CreditManager creditManager=new CreditManager();
//		creditManager.Hesapla();
//		creditManager.Calculate();
//		creditManager.Save();
//		System.out.println(creditManager);
		
		
		
		
		Customer customer= new Customer();
		customer.Id=1;
		customer.name= "Engin";
		customer.lastname="Demiroğ";
		customer.NatioanlIdentity="1111119";
		System.out.println(customer);
		

	}
	
	class CreditManager {
		public void Hesapla() {
			System.out.println("Hesaplandı");
		}
		public void Save(int id, String FirstName, String LastName, String NationalIdentity) {
			System.out.println("Kredi verildi");
		}
		
		public void Calculate() {
			System.out.println("Hesaplandı");
		}
		
	}
	
	class Customer{
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
		
		
		//Katmanlı Mimariler
		public void Save() {
			System.out.println("Müşteri kaydedildi");
		}
		
	}

}
