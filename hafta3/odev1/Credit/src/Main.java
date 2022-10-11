import ClassCredit.CreditManager;

public class Main {

	public static void main(String[] args) {
		CreditManager creditManager=new CreditManager();
		creditManager.Hesapla();
		creditManager.Calculate();
		creditManager.Save();
		System.out.println(creditManager);

	}
	class CreditManager {
		public void Hesapla() {
			System.out.println("Hesaplandı");
		}
		public void Save() {
			System.out.println("Kredi verildi");
		}
		
		public void Calculate() {
			System.out.println("Hesaplandı");
		}

}
