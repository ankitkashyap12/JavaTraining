/**
 * 
 */
package com.training.set.example;

import java.util.HashSet;
import java.util.TreeSet;

import com.training.Invoice;
import com.training.util.InvoiceNumberComparator;

/**
 * @author ankit
 *
 */
public class UsingSetAPI {
	public static void main(String[] args)
	{
		Invoice raj=new Invoice(34, "ankit", 55);
		Invoice raj1=new Invoice(34, "ankit", 55);
		Invoice ram=new Invoice(44, "an45", 75);
		Invoice shyam=new Invoice(94, "ant", 65);
		
		HashSet<Invoice> hashSet =new HashSet<Invoice>();
		hashSet.add(raj);
		hashSet.add(raj1);
		hashSet.add(ram);
		hashSet.add(shyam);
		System.out.println("for hashset");
		
		for(Invoice e:hashSet)
		{
			System.out.println(e);
		}
		
		
		TreeSet<Invoice> treeExample =new TreeSet<Invoice>(new InvoiceNumberComparator());
		treeExample.add(raj);
		treeExample.add(ram);
		treeExample.add(shyam);
		boolean isAdded=treeExample.add(raj1);
		System.out.println(isAdded);
		System.out.println("Tree set natural ");
		
		for(Invoice e:treeExample )
		{
			System.out.println(e);
		}
		
		
		
		
	}
	
	

}
