
abstract public class BaseCreditManager implements CreditManager{

	public abstract void calculate();
	
	public  void save() {
		System.out.println("Kaydedildi");
	}

}
