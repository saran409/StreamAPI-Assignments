package com.api.lambda;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	public static void main(String[] args) {
		 
		String arr[]= {"hi","for","each"};
		
		
		Consumer<String> con=(t)->{
			String addOn=" you";
			
			System.out.println(t+addOn);
			
		};
		
		for(String i: arr) {
			con.accept(i);
			
		}
	}

}
