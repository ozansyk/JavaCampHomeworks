package javaCampHw4___2.Adapters;

import java.rmi.RemoteException;

import javaCampHw4___2.abstracts.CustomerCheckService;
import javaCampHw4___2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(
					Long.parseUnsignedLong(customer.getNationalityId()), 
					customer.getName(),
					customer.getLastName(), 
					customer.getDateOfBirth()
					
					);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
