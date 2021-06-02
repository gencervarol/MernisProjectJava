package business.concretes;

import business.abstracts.Customer_Service;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements Customer_Service
{

	@Override
	public void add(Customer customer) {

		System.out.println( customer.getFirstName() + " : Sisteme kaydedilmiþtir. ");
		
	}
	
}
