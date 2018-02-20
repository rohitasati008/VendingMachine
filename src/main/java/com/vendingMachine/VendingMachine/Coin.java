package com.vendingMachine.VendingMachine;

public enum Coin {
fourth,half,full ;

public static boolean contains(Coin amount) {
	// TODO Auto-generated method stub
	 
	int flag = 0;
	for(Coin c : Coin.values())
	{
		if(c.equals(amount))
			flag = 1;
	}
	if(flag==1)
		return true ;
	else
		return false ;
}
}
