package za.ac.cput.adp_capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp_capstone.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{

}
