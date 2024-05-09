package za.ac.cput.adp_capstone.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {

    @Id

    private String customerId;
    private String customerFName;
    private String customerLName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;

    public Customer(){
    }

    public Customer(Builder builder){
        this.customerId = builder.customerId;
        this.customerFName = builder.customerFName;
        this.customerLName = builder.customerLName;
        this.customerEmail  = builder.customerEmail;
        this.customerPhone  = builder.customerPhone;
        this.customerAddress  = builder.customerAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(customerFName, customer.customerFName) && Objects.equals(customerLName, customer.customerLName) && Objects.equals(customerEmail, customer.customerEmail) && Objects.equals(customerPhone, customer.customerPhone) && Objects.equals(customerAddress, customer.customerAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerFName, customerLName, customerEmail, customerPhone, customerAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerFName='" + customerFName + '\'' +
                ", customerLName='" + customerLName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }

    public static class Builder{
        private String customerId;
        private String customerFName;
        private String customerLName;
        private String customerEmail;
        private String customerPhone;
        private String customerAddress;

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCustomerFName(String customerFName) {
            this.customerFName = customerFName;
            return this;
        }

        public Builder setCustomerLName(String customerLName) {
            this.customerLName = customerLName;
            return this;
        }

        public Builder setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Builder setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public Builder setCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Builder copy(Customer customer){
            this.customerId = customer.customerId;
            this.customerFName = customer.customerFName;
            this.customerLName = customer.customerLName;
            this.customerEmail  = customer.customerEmail;
            this.customerPhone  = customer.customerPhone;
            this.customerAddress  = customer.customerAddress;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
