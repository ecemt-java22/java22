package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepositroy{

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}
	
	

}
