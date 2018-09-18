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


import java.util.Scanner;
import java.util.Random;

public class OrderProcessor {
	private String companyName;
	private String companyWebsite;
	private Order orderList[];
	private int orderCount;

	public static final int SIZE_ARRAY = 32;

	public OrderProcessor() {
		orderCount = 0;
		orderList = new Order[SIZE_ARRAY];
	}

	public OrderProcessor(String companyName, String companyWebsite) {
		this.companyName = companyName;
		this.companyWebsite = companyWebsite;
		orderCount = 0;
		orderList = new Order[SIZE_ARRAY];
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public void init() {
		double LOW = 100.0;
		double HIGH = 1000.0;
		int quantity = 0;
		int day = 0;
		double price = 0;

		String[] customer = { "John Doe", "Jane Doe", "Sally Mae", "Tim Smith", "Will Johnson", "Kate Lee", "Tom Jones",
				"Tuba Siddiqui" };

		String[] product = { "iPhone 8", "iPhoneX", "MacBook Air", "MacBook Pro", "iPhone 6", "iPad", "Samsung Galaxy",
				"Chromebook" };

		Random generator = new Random();

		for (int i = 0; i < customer.length; i++) {

			quantity = generator.nextInt(10) + 1;

			day = generator.nextInt(30) + 1;

			price = LOW + generator.nextDouble() * (HIGH - LOW);

			orderList[i] = new Order(); // creates new Order object

			// sets new order object values
			orderList[i].setCustomer(customer[i]);
			orderList[i].setProduct(product[i]);
			orderList[i].setQuantity(quantity);
			orderList[i].setDay(day);
			orderList[i].setPrice(price);

			orderCount++;

		} // close for loop
	} // close init()

	public void addOrder() {
		Order newObject = new Order();

		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter order information:");
		System.out.println("Customer Name?");
		String customer = scnr.nextLine();
		System.out.println("Product Name?");
		String product = scnr.nextLine();
		System.out.println("Quantity?");
		int quantity = scnr.nextInt();
		System.out.println("What day of the month is today?");
		int day = scnr.nextInt();
		System.out.println("Price?");
		double price = scnr.nextDouble();

		newObject.setCustomer(customer);
		newObject.setProduct(product);
		newObject.setQuantity(quantity);
		newObject.setDay(day);
		newObject.setPrice(price);

		if (orderCount < SIZE_ARRAY) {
			orderList[orderCount] = newObject;
			orderCount++;
		} else {
			System.out.println("Sorry, the array is full. Your order was not added.");
		}

	}

	public void reportOrderDetails() {
		System.out.println("Company: " + companyName + "\t\t" + "Web-site: " + companyWebsite);
		for (int i = 0; i < orderCount; i++) {
			if (orderList[i] != null) {
				System.out.print((i + 1) + "\t" + orderList[i].getcustomer() + " " + orderList[i].getproduct() + " "
						+ orderList[i].getQuantity() + " $");
				System.out.printf("%.2f", orderList[i].getPrice());
				System.out.println(
						" " + orderList[i].getMonth() + "/" + orderList[i].getDay() + "/" + orderList[i].getYear());
			}
		}
		System.out.println();
	}

}
