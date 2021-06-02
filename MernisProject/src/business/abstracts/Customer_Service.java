package business.abstracts;

import entities.concretes.Customer;

public interface Customer_Service 
{
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
