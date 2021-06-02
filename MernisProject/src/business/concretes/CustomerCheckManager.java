package business.concretes;

import business.abstracts.Customer_Check_Service;
import entities.concretes.Customer;

public class CustomerCheckManager implements Customer_Check_Service{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
