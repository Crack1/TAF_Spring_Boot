package com.udemy.spring.springselenium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class User {
    private final Address address;
    private Salary salary;

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }



    public User(Address address) {
        this.address = address;

    }
    public void printDetails(){
        System.out.println("Address: " + this.address.getStreet());
        System.out.println("Salary: " + this.salary.getAmount());
    }
}
