package javaCampHw4___2.concretes;

import javaCampHw4___2.abstracts.BaseCustomerManager;
import javaCampHw4___2.abstracts.CustomerCheckService;
import javaCampHw4___2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService CustomerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		CustomerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(CustomerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to DB: " +customer.getName());
		} else {
			System.out.println("Not a valid person.");
		}
	}
}
