package com.training.ifaces;

import java.util.Collection;

import com.training.Invoice;

public interface InvoiceDAO {
	
	Collection<Invoice> findall();
	Collection<Invoice> sortedByInvoiceNumber();
	Collection<Invoice> sortedBy(String propName);
	boolean add(Invoice entity);
	Invoice findById(int id);
	boolean add(Invoice...invoices); //variable arguments
	
	boolean remove(Invoice entity);
	boolean update(Invoice oldElement,Invoice newElement);
	

}
