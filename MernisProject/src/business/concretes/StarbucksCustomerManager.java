package business.concretes;

import business.abstracts.Customer_Check_Service;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager 
{
	private Customer_Check_Service customerCheckService;

	public StarbucksCustomerManager(Customer_Check_Service customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer))
		{
			super.add(customer);
		}
		else 
		{
			System.out.println("Not a valid person");
		}		
	
	
	
	
	
	
	
	
	
	
	
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
