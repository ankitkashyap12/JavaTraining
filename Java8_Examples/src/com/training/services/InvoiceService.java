package com.training.services;

import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import com.training.entity.Invoice;

import java.util.*;

public class InvoiceService {
	
	private List<Invoice> invoiceList;

	/**
	 * @param invoiceList
	 */
	public InvoiceService(List<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}

	/**
	 * 
	 */
	public InvoiceService() {
		super();
		this.invoiceList=Arrays.asList(new Invoice(101, "Ram", 800),
				new Invoice(201, "Shyam", 1800),
				new Invoice(701, "TukaRam", 800),
				new Invoice(601, "Shyam", 500),
				new Invoice(901, "RaamRam", 7800));
	}

	/**
	 * @return the invoiceList
	 */
	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}

	/**
	 * @param invoiceList the invoiceList to set
	 */
	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public Optional<List<Invoice>> filterByName(String name)
	{
		List<Invoice> invList=null;
//		Optional<List<Invoice>> invList=Optional.of(null);
		 invList = invoiceList.stream()
				.filter((eachInvoice)->eachInvoice.getCustomerName().equals(name))
				.collect(toList());
//		invList=Optional<List<Invoice>> invListTemp;
//		if(invList.size()==0)
//		{
//			return Optional.ofNullable(null);
//		}
		return Optional.ofNullable((invList));
//		return invList;
	}

	public Map<Integer,Double> fetchInvoiceDetailsByName(String name){
		
	Map<Integer,Double> list=null;
	
	list=invoiceList.stream().filter((Invoice inv)->inv.getCustomerName().equalsIgnoreCase(name)).collect(Collectors.toMap(Invoice::getInvoiceNumber,Invoice::getAmount));
	return list;
		
		
	}
	
	
	public double findMaxAmount()
	{
		Comparator<Invoice> comparator = Comparator.comparing( Invoice::getAmount );
		Invoice  maxAmount=invoiceList.stream().max(comparator).get();
		return maxAmount.getAmount();
	}
	
	public double countInvoices(String name)
	{
		double count=invoiceList.stream().filter((Invoice inv)->inv.getCustomerName().equalsIgnoreCase(name)).count();
		return count;
	}
	
}
