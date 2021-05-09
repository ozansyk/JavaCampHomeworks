package javaCampHw4___2.abstracts;

import javaCampHw4___2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB: " +customer.getName());
	}

}
