/**
 * Name: May Perriello
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/23
 * File Name: businessCustomer.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665.assignment3.com.customer;

public class BusinessCustomer implements Customer {

  @Override
  public void generateEmail() {
    System.out.println("Subject: Hello Business Partner \n \n Hello! \n "
            + "We are happy to a contributing part of your business. \n \n Best, \n Company");
  }
}
