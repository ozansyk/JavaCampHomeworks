package javaCampHw4___2;

import java.util.Date;

import javaCampHw4___2.Adapters.MernisServiceAdapter;
import javaCampHw4___2.abstracts.BaseCustomerManager;
import javaCampHw4___2.concretes.NeroCustomerManager;
import javaCampHw4___2.concretes.StarbucksCustomerManager;
import javaCampHw4___2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Ozan", "Soyak", new Date(1990,1,1), "5445435674"));
		
	}

}
