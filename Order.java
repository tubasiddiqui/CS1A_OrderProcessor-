//==============================================================================
//File Name: TechOrderInformation.java
//Author: Tuba Siddiqui
//Copyright: Copyright 2018 by Tuba Siddiqui
//Description: the purpose of this program is to create 3 different classes using constructors, setter/getter, and array methods to create a program that displays user input orders
//Revision History: 
//Date:                    Version:                  Author:                      Description:  
//6/17/18                    1.0                    Tuba Siddiqui                 initial creation using pseudo code methods on text editor
//6/18/18                    1.1                     Tuba Siddiqui                 Adding in reportOrderDetails 
//6/20/18                    1.2                     Tuba Siddiqui                 running program and checking for bugs 
//====================================================================================


public class Order {

	private String customer;
	private String product;
	private double price;
	private int quantity;
	private int month;
	private int day;
	private int year;

	public Order() {
		customer = "John Doe";
		product = "Unknown";
		price = 0.0;
		quantity = 0;
		month = 06;
		day = 01;
		year = 18;

	}

	public Order(String customer, String product, double price, int quantity, int month, int day, int year) {
		this.customer = customer;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.month = month;
		this.day = day;
		this.year = year;

	}

	public String getcustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getproduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double orderCost() {
		return (price * quantity);
	}

	public boolean endOfMonth(int day) {
		if ((day >= 25) && (day <= 30)) {
			return true;
		} else {
			return false;
		}
	}
}
