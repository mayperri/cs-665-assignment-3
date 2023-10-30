/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: Main.java
 * Description: This is an application the generates
 * specific emails targeted at the different types of customers.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assignment3.com.customer.Customer;
import edu.bu.met.cs665.assignment3.com.customer.EmailGeneratorFactory;


/**
 * This is the Main class.
 */
public class Main {
  /**
   * A main method to run examples.
   * This method starts the build and generates
   * the first email sent to VIPs.
   */
  public static void main(String[] args) {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("VIP");
    email.generateEmail();
  }

}
