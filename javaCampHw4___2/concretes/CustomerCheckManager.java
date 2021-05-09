package javaCampHw4___2.concretes;

import javaCampHw4___2.abstracts.CustomerCheckService;
import javaCampHw4___2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
