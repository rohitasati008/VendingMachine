package com.vendingMachine.VendingMachine;

import java.util.HashMap;

public class ItemInventory<K> {
private HashMap<K, Integer> map = new HashMap<>();

public HashMap<K, Integer> getMap() {
	return map;
}

public void setMap(HashMap<K, Integer> map) {
	this.map = map;
}
public void fill(K item,int a)
{
	map.put(item, a);
}
public boolean hasItem(K item) throws itemNotAvailableException
{
	if(map.get(item)>0)
		return true;
	else 
		throw new itemNotAvailableException();
}
public void deduct(K item , int value ) throws quantityNotAvailableException
{
	
	int oldvalue = map.get(item);
	if(oldvalue - value >0 )
	{
		oldvalue -=  value ;
	map.put(item, oldvalue);
	}
	else 
  throw new quantityNotAvailableException();
}
}
