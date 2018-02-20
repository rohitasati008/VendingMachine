package com.vendingMachine.VendingMachine;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	@Autowired
    User u ;
	@Autowired
	VendingMachine s ;
    public void testApp()
    {
    	
        u.setAmount(30);
        u.setCode(1);
        u.setQuantity(1);
      //  s.validateCode(u);
    ArrayList<Product> ar =    s.getAr() ;
    for(Product p : ar)
    {
    	System.out.println(p);
    }
        
    }
}
