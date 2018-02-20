package com.vendingMachine.VendingMachine;

public class vendingFactory {
public VendingMachine createVendingMachineFactory()
{
	return new VendingMachineImpl();
}
}
