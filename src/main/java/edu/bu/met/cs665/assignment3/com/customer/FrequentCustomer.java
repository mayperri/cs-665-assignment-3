/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: FrequentCustomer.java
 * Description: Class for frequent customers
 */

package edu.bu.met.cs665.assignment3.com.customer;

public class FrequentCustomer implements Customer {

  @Override
  public void generateEmail() {
    System.out.println("Subject: Hello Old Friend \n \n Hello Again! \n "
            + "Thank you for your continued interest. \n \n Best, \n Company");
  }
}
