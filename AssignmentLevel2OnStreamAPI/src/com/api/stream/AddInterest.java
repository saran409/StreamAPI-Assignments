package com.api.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.api.model.Account;

public class AddInterest{

		static List<Account> allAccounts;
		public static void main(String[] args) {
			 
			Account acc1 =new Account(2342, "saran", 200, "bangalore");
			Account acc2 =new Account(5624, "sharuk", 5000, "chennai");
			Account acc3 =new Account(4634, "andy", 7000, "chennai");
			Account acc4 =new Account(7448, "yuvash", 4000, "coimbatore");
			Account acc5 =new Account(2342, "lalith", 6768, "bangalore");
			Account acc6 =new Account(6342, "karthik", 4628, "bangalore");
			allAccounts = Arrays.asList(acc1,acc2,acc3,acc4);
			
		    List<Account> finalAcc=doInterest();
		    System.out.println(finalAcc);
		}  
		public static List<Account> doInterest()
		{
			List<Account> outputList = 
				allAccounts.stream().
				filter((acc)->{
					if(acc.getBalance()>1000) return true;
					else {
						System.out.println("error low balance  "+acc.getAccountHolderName()+" has  " +acc.getBalance()+ " in savings ");
					}
					return false;
			    }).
				map(emp->{
					int oldBalance = emp.getBalance();
					int newBalance = (int)(oldBalance*0.02)+oldBalance;
					emp.setBalance(newBalance);
					return emp;
				}).collect(Collectors.toList());
			
			return outputList;
			
		}
			
			
		}





