package com.cg.banking.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Random;

import com.cg.banking.dto.Customer;

public class DButil {
	static Random rand = new Random();
	public static HashMap<String, Customer> bankDBMap = new HashMap<>();
	public static HashMap<String, String> bankCredentialsDBMap = new HashMap<>();
	static {
		bankCredentialsDBMap.put("162121", "iti12");
		bankDBMap.put("162121",new Customer("162121", "Iti Agrawal",
				LocalDate.of(1996, Month.MAY, 24), "Saving", 15500.0F, 200000.0));
		bankCredentialsDBMap.put("125469", "abc12");
		bankDBMap.put("125469", new Customer("125469", "Meghna Verma",
				LocalDate.of(2018, Month.SEPTEMBER, 26), "Current", 15500.0F,200000.0));
		bankCredentialsDBMap.put("785412", "rt123");
		bankDBMap.put("785412", new Customer("785412", "Jyotiraditya Singh",
				LocalDate.of(2018, Month.SEPTEMBER, 14), "Saving", 15500.0F,200000.0));
		bankCredentialsDBMap.put("845745", "yt657");
		bankDBMap.put("845745",new Customer("845745", "Kirti Verma",
				LocalDate.of(2017, Month.DECEMBER, 15), "Current", 15500.0F, 200000.0));
	}

	public static String newCustomer(String password, Customer customer) {
		bankCredentialsDBMap.put(customer.getAccNumber(), password);
		bankDBMap.put(customer.getAccNumber(), customer);
		return customer.getAccNumber();
	}

	public static HashMap<String, String> getAllCustCred() {
		return bankCredentialsDBMap;
	}

	public static HashMap<String, Customer> getAllCustomer() {
		return bankDBMap;
	}
}
