package za.ac.cput.adp_capstone.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.adp_capstone.domain.Customer;
import za.ac.cput.adp_capstone.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
    private static Customer customer1;
    private static Customer customer2;

    @Test
    @Order(1)
    void setUp() {
        customer1 = CustomerFactory.buildCust("CU023", "john", "Doe","jdoe@gmail.com","0627384755","22 Dageraad Road, Ottery");
        assertNotNull(customer1);
        System.out.println(customer1);

        customer2 = CustomerFactory.buildCust("CU024","Mick","Tyson","mickt@outlook.com","0728473622","33 Danger Way, Belville");
        assertNotNull(customer2);
        System.out.println(customer2);

    }

    @Test
    @Order(2)
    void create() {

        Customer create1 = customerService.create(customer1);
        assertNotNull(create1);
        System.out.println(create1);

        Customer create2 = customerService.create(customer2);
        assertNotNull(create2);
        System.out.println(create2);

    }
    @Test
    @Order(3)
    void update() {
        Customer newCust = new Customer.Builder().copy(customer2).setCustomerFName("Michael").build();
        Customer update = customerService.update(newCust);
        System.out.println("Update: " + update);
    }

    @Test
    @Order(4)
    void read() {
        Customer read = customerService.read(customer1.getCustomerId());
        assertNotNull(read);
        System.out.println("Customer ID: " + read);
    }
    @Test
    @Order(5)
    void getAll() {
        System.out.println(customerService.getAll());
    }

}