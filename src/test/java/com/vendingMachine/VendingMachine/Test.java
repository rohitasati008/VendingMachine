
package com.vendingMachine.VendingMachine;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
 
public static void main(String[] args) {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
	User u = ctx.getBean(User.class);
	VendingMachine s = ctx.getBean(VendingMachine.class);
	 u.setAmount(Coin.fourth);
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
    
 

