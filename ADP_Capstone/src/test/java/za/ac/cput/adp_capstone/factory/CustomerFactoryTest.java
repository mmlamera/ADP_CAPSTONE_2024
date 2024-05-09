package za.ac.cput.adp_capstone.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.adp_capstone.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void buildCust() {
        Customer cust1 = CustomerFactory.buildCust("CU002","Jack","Jill","jjill@outlook.com","0872834733","12 Hill Way, Strandfontein");
        assertNotNull(cust1);
        System.out.println(cust1);
    }

    @Test
    void failBuildEmp() {
        Customer cust2= CustomerFactory.buildCust("","Micheal","Cors", "mcors@gmail.com","0837326372","43 Marlin Crescent, BayView");
        assertNotNull(cust2);
        System.out.println(cust2);
    }
}