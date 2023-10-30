/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: NewCustomer.java
 * Description: Class for new customers
 */

package edu.bu.met.cs665.assignment3.com.customer;

public class NewCustomer implements Customer {
  public void generateEmail() {
    System.out.println("Subject: Welcome New Customer \n \n Hello! \n "
            + "Welcome, we are happy to have you here. \n \n Best, \n Company");
  }
}
