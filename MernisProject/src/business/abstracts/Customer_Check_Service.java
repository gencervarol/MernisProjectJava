package business.abstracts;

import entities.concretes.Customer;

public interface Customer_Check_Service 

{
	boolean checkIfRealPerson(Customer customer);
}
