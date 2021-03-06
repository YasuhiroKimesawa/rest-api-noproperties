package example.service.customer;

import example.model.customer.Customer;
import example.model.customer.CustomerId;
import example.model.customer.CustomerRepository;

import example.model.customer.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    public Customers findAll()
    {
        return customerRepository.findAll();
    }

    public Customer findBy( CustomerId customerId )
    {
        return customerRepository.findBy( customerId );
    }

    public Customer register( Customer customer )
    {
        return customerRepository.register( customer );
    }
}
