package com.shop.serviceDAO;

import com.shop.customer.Customer;

public interface CustomerServiceDAO {
	
	Customer saveCustomer(Customer customer);
	
	Long isCustomerPresent(Customer customer);

}
