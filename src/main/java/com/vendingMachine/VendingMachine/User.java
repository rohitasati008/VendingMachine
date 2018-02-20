package com.vendingMachine.VendingMachine;

import org.springframework.stereotype.Component;

@Component
public class User {
int code ;
Coin amount ;
int quantity;
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public Coin getAmount() {
	return amount;
}
public void setAmount(Coin amount) {
	this.amount = amount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
