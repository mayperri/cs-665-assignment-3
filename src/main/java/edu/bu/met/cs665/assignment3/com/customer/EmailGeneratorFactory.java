/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: EmailGeneratorFactory.java
 * Description: This class declares the factory method.
 */

package edu.bu.met.cs665.assignment3.com.customer;

public class EmailGeneratorFactory {
  /**
   * Creates a customer object and returns
   * appropriate messaging.
   */
  public Customer getCustomer(String str) {
    Customer customer = null;

    if (str.equals("New")) {
      customer = new NewCustomer();
    } else if (str.equals("Returning")) {
      customer = new ReturningCustomer();
    } else if (str.equals("Frequent")) {
      customer = new FrequentCustomer();
    } else if (str.equals("VIP")) {
      customer = new VipCustomer();
    } else if (str.equals("Business")) {
      customer = new BusinessCustomer();
    }
    return customer;

  }
}
