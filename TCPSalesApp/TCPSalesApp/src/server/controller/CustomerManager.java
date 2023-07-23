package server.controller;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerManager {
	private List<Customer> customers = new ArrayList<Customer>();
	
	/**
	 * This loads sample of customers into the customer list
	 * */
	private void loadCustomers() {
		
		String[] ids = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10"};
		String[] names = {"John", "Jane", "Thomas", "Albert", "Brian", "Gregory", "Yimir", "Ezekiel", "Rupert", "Lois"};
		
		for (int index = 0; index < 10; index++) {
			Customer customer = new Customer();
			customer.setCustomerId(ids[index]);
			customer.setName(names[index]);
			customers.add(customer);
		}
	}
	
	
}
