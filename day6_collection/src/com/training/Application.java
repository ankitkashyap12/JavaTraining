package com.training;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.training.daos.InvoiceDaoImpl;
import com.training.ifaces.InvoiceDAO;
import com.training.util.CustomerNameSort;
import com.training.util.InvoiceNumberComparator;

public class Application {
	public static void printList(Collection<Invoice> invList)
	{
		Iterator<Invoice> iterator =invList.iterator();
		while (iterator.hasNext()) {
			
			Invoice inv=iterator.next();
			System.out.println(inv);
			
		}
	}

	public static void main(String[] args) {

		Invoice ram=new Invoice(121, "ram", 765);
		Invoice ram2=new Invoice(191, "kam2", 865);
		Invoice ram3=new Invoice(181, "tam3", 165);
		Invoice ram4=new Invoice(141, "aam4", 465);
		Invoice ram5=new Invoice(651, "oamaaa", 965);
		
		InvoiceDAO dao=new InvoiceDaoImpl();
		dao.add(ram);
		dao.add(ram4,ram2,ram3);
		
		Collection<Invoice> invList=dao.findall();
		
		System.out.println("before deleting : ");
		printList(invList);
//		invList.remove(ram4);
//		System.out.println("after removing :");
		boolean updated= dao.update(ram,ram5);
		System.out.println(updated);
		dao.sortedByInvoiceNumber();
		System.out.println("Afetr sorting by invoice number ");
		printList(invList);
		
		InvoiceNumberComparator invComp=new InvoiceNumberComparator();
//		Collections.sort(dao,invComp);
		System.out.println(" by invoice again");
		printList(invList);
		
		CustomerNameSort custSort=new CustomerNameSort();
		custSort.compare(ram3, ram4);
		System.out.println("By name");
		printList(invList);
//		System.out.println(dao.findById(141));
		
		
		
	}

}
