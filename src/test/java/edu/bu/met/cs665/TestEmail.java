package edu.bu.met.cs665;

import org.junit.Test;

import edu.bu.met.cs665.assignment3.com.customer.Customer;
import edu.bu.met.cs665.assignment3.com.customer.EmailGeneratorFactory;


public class TestEmail {
  public TestEmail() {
  }

  @Test
  public void testVip() {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("VIP");
    email.generateEmail();
  }

  @Test
  public void testNew() {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("New");
    email.generateEmail();
  }

  @Test
  public void testReturning() {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("Returning");
    email.generateEmail();
  }

  @Test
  public void testFrequent() {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("Frequent");
    email.generateEmail();
  }

  @Test
  public void testBusiness() {
    EmailGeneratorFactory cust = new EmailGeneratorFactory();
    Customer email = cust.getCustomer("Business");
    email.generateEmail();
  }


}
