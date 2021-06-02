package adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import business.abstracts.Customer_Check_Service;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter   implements Customer_Check_Service
{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy checkCustomerInformation = new KPSPublicSoapProxy();
		boolean result= true;
		
		try 
		{
			result = checkCustomerInformation.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
		} 
		
		
		catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
		
		return result;
	}
	
}
