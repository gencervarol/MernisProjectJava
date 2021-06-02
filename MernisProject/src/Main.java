import adapter.MerniceServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main 

{

	public static void main(String[] args) 
	
{

		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		
//									Customer(int id ,"Adý", "Soyadý", int Doðum Yýlý , "TC Kimlik No"))
		baseCustomerManager.add(new Customer(1, "Adý", "Soyadý", 1900 , "TC Kimlik No"));
}

}
