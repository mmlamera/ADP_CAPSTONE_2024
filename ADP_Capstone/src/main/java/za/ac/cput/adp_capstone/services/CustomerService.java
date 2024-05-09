package za.ac.cput.adp_capstone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adp_capstone.domain.Customer;
import za.ac.cput.adp_capstone.repository.CustomerRepository;

import java.util.List;

@Service

public class CustomerService implements ICustomerService {

    private CustomerRepository repository;

    @Autowired
    CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer read(String customerId) {
        return repository.findById(customerId).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }
}
