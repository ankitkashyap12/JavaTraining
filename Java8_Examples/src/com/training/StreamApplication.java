package com.training;

import java.util.List;
import java.util.Optional;


import com.training.entity.Invoice;
import com.training.services.InvoiceService;

public class StreamApplication {

	public static void main(String[] args) {


		InvoiceService service=new InvoiceService();
//		service.filterByName("Shyam").ifPresent(list->list.forEach(System.out::println)); //type 1
//		System.out.println(service.findMaxAmount());
//		System.out.println(service.fetchInvoiceDetailsByName("Ram"));
//		System.out.println(service.countInvoices("Shyam"));
		
//		type 2
		Optional<List<Invoice>> list=service.filterByName("");
		if(list.isPresent())
		{
			list.get().forEach(System.out::println);
		}else
		{
			System.out.println("No value is there  ");
		}
		//type 3
		
		
		Optional<List<Invoice>> list2=service.filterByName("Ankit");
		
		list2.orElseThrow(()->new RuntimeException("Null value-Exception"));
	}

}
