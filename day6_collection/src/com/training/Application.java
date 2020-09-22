package com.training;

import java.util.Collection;
import java.util.Iterator;

import com.training.daos.InvoiceDaoImpl;
import com.training.ifaces.InvoiceDAO;

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
		Invoice ram2=new Invoice(191, "ram2", 865);
		Invoice ram3=new Invoice(181, "ram3", 165);
		Invoice ram4=new Invoice(141, "ram4", 465);
		Invoice ram5=new Invoice(651, "ram5", 965);
		
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
//		printList(invList);
		System.out.println(dao.findById(141));
		
		
		
	}

}
