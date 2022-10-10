package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = new customerDal;		
	}
	
	public void add() {
		//Is kodları 
		customerDal.Add();
	}

}
