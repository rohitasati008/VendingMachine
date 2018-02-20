package com.vendingMachine.VendingMachine;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public interface VendingMachine {
public boolean validate(User ob) throws InvalidInputException;
public int selectItemAndGetPrice(String itemcode);
public void resetMachine();
public void cancelAndRefund();
public Bucket<Product,Integer> giveProduct(User ob );
 

}
