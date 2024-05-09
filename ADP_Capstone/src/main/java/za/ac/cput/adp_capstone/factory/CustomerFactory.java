package za.ac.cput.adp_capstone.factory;

import za.ac.cput.adp_capstone.domain.Customer;
import za.ac.cput.adp_capstone.util.Helper;
public class CustomerFactory {

    public static Customer buildCust( String customerId, String customerFName, String customerLName,
                                      String customerEmail,String customerPhone,String customerAddress) {
        if (Helper.isNullOrEmpty(customerId) || Helper.isNullOrEmpty(customerFName) || Helper.isNullOrEmpty(customerLName) ||
                Helper.isNullOrEmpty(customerEmail) || Helper.isNullOrEmpty(customerPhone) || Helper.isNullOrEmpty(customerAddress)){
            return null;

            //Note to self: dont forget email validation in variable check ^^^^
    }
        String custNum = Helper.generateId();
        return new Customer.Builder()
                .setCustomerId("CN" + custNum)
                .setCustomerFName(customerFName)
                .setCustomerLName(customerLName)
                .setCustomerEmail(customerEmail)
                .setCustomerPhone(customerPhone)
                .setCustomerAddress(customerAddress)
                .build();
    }
}
