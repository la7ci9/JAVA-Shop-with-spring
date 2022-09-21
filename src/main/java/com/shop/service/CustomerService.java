package com.shop.service;

import org.springframework.stereotype.Service;

import com.shop.customer.Customer;
import com.shop.repositorys.CustomerRepository;
import com.shop.serviceDAO.CustomerServiceDAO;

@Service
public class CustomerService implements CustomerServiceDAO {

	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Long isCustomerPresent(Customer customer) {
		return (customerRepository.findByNameAndEmail(customer.getFirstName(), 
				customer.getLastName(),
				customer.getEmail()))!= null ? customer.getId() : null;
	}

}
