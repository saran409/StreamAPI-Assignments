package com.api.stream;

import java.util.Arrays;
import java.util.List;

import com.api.model.Account;

public class PrintAllAccounts {
	static List<Account> allAccounts;
	public static void main(String[] args) {
		 
		Account acc1 =new Account(2342, "saran", 2000, "bangalore");
		Account acc2 =new Account(5624, "sharuk", 5000, "chennai");
		Account acc3 =new Account(4634, "andy", 7000, "chennai");
		Account acc4 =new Account(7448, "yuvash", 4000, "coimbatore");
		Account acc5 =new Account(2342, "lalith", 6768, "bangalore");
		Account acc6 =new Account(6342, "karthik", 4628, "bangalore");
		allAccounts = Arrays.asList(acc1,acc2,acc3,acc4);
		
	    doPrintAcc();
	}  
		public static void doPrintAcc()
		{
			allAccounts.stream().forEach((e)->{
				System.out.println(e);
			});
			
		}
		
		
	}


