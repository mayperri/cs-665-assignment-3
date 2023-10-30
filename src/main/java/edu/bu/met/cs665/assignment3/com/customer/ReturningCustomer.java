/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: ReturningCustomer.java
 * Description: Class for returning customers
 */

package edu.bu.met.cs665.assignment3.com.customer;

public class ReturningCustomer implements Customer {
  @Override
  public void generateEmail() {
    System.out.println("Subject: Hello Again! \n \n Welcome back! \n "
            + "We are happy to see that you are returning. \n \n Best, \n Company");
  }
}
