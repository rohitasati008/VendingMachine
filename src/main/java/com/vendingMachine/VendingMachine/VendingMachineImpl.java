package com.vendingMachine.VendingMachine;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class VendingMachineImpl implements VendingMachine {
	
ItemInventory<Coin> Cashinventory = new ItemInventory<>();
ItemInventory<Product> productInventory = new ItemInventory<>();
 
public void VendingMachineImpl()
{
	initialize();
}


	private void initialize() {
	// TODO Auto-generated method stub
		for(Coin c : Coin.values())
			Cashinventory.fill(c, 5);
		Product p1 = new Product();
		p1.setCode(1);
		p1.setPrice(34);
		productInventory.fill(p1, 5);
}


	public boolean validate(User ob) throws InvalidInputException {
		if(Coin.contains(ob.amount) && (ob.code==1))
		{
			
				return true;
		}
		else 
			throw new InvalidInputException();
	}

	public Bucket giveProduct(User ob) {
		return null;
		// TODO Auto-generated method stub
		
	}
 


	@Override
	public int selectItemAndGetPrice(String itemcode) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void resetMachine() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cancelAndRefund() {
		// TODO Auto-generated method stub
		
	}

 

}
