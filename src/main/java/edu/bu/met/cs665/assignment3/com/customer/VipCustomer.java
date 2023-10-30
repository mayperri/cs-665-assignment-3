/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: VipCustomer.java
 * Description: Class for VIP customers
 */

package edu.bu.met.cs665.assignment3.com.customer;



public class VipCustomer implements Customer {
  @Override
  public void generateEmail() {
    System.out.println("Subject: Hello Valued Customer \n \n Hello! \n "
            + "Thank you for continuing this important relationship. \n \n Best, \n Company");
  }
}
