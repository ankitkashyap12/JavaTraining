package com.training.daos;

//import java.util.Collection;
import java.util.*;

import com.training.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.util.CustomerNameSort;
import com.training.util.InvoiceNumberComparator;

public class InvoiceDaoImpl implements InvoiceDAO {

	private List<Invoice> invList;
	
	
	
	public InvoiceDaoImpl() {
		super();
		this.invList=new ArrayList<Invoice>();
		
	}

	@Override
	public Collection<Invoice> findall() {
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		
//		boolean result=false;
		return this.invList.add(entity);
	}

	@Override
	public boolean add(Invoice... invoices) {
		// TODO Auto-generated method stub
		boolean result =false;
		for(Invoice eachInvoice: invoices)
		{
			add(eachInvoice);
			result=true;
		}
		return result;
	}

	@Override
	public Invoice findById(int id) {
		Invoice invElement=null;
		for(Invoice inv:invList)
		{
			if(inv.getInvoiceNumber()==id)
			{
				invElement=inv;
			}
		}
		return invElement;
	
	}

	@Override
	public boolean remove(Invoice entity) {
		return this.invList.remove(entity);
	}

	@Override
	public boolean  update(Invoice oldElement, Invoice newElement) {
		boolean updated=false;
		if(this.invList.contains(oldElement))
		{
			int indx=invList.indexOf(oldElement);
//			invList[indx]=newElement;
			this.invList.set(indx, newElement);
			updated=true;
			
		}
		
		return updated;
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		
		 Collections.sort(this.invList);
		 return this.invList;
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		
		if(propName.equalsIgnoreCase("InvoiceNumber")) {
			Collections.sort(this.invList, getComparator(1));
		}
		else if(propName.equalsIgnoreCase("InvoiceNumber")){
			
			Collections.sort(this.invList,getComparator(2));
		}
		
		
		return this.invList;
	}
	
	
	
	
	private Comparator<Invoice> getComparator(int key)
	{
		switch (key) {
		case 1:
			
			return new InvoiceNumberComparator();
		case 2:
			return new CustomerNameSort();

		default:
			return null;
		}
		
	}
	
	//indexOf,contains,set
	
	

}
