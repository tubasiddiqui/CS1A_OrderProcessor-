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

public class TechOrderInformation {

	public static void main(String[] args) {

		OrderProcessor newOrder = new OrderProcessor("Siddiqui Inc", "www.siddiquitech.com");
		
		newOrder.init();
		
		newOrder.reportOrderDetails();
		
		for (int count =0; count <3; count++) {
			newOrder.addOrder();
		}
		
		newOrder.reportOrderDetails();
	}

}
