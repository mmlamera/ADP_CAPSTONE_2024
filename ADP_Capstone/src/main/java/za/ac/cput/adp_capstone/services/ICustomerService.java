package za.ac.cput.adp_capstone.services;

import za.ac.cput.adp_capstone.domain.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer, String>{
    List<Customer> getAll();
}
