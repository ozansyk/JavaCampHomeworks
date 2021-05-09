package javaCampHw4___2;

import java.util.Date;

import javaCampHw4___2.abstracts.BaseCustomerManager;
import javaCampHw4___2.concretes.NeroCustomerManager;
import javaCampHw4___2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Ozan Soyak", new Date(1992,3,1), "11026424640"));
		
	}

}
