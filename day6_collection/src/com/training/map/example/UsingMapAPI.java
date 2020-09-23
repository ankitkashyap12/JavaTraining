package com.training.map.example;

import com.training.Invoice;
import java.util.*;

public class UsingMapAPI {

	public static void main(String[] args) {


		Invoice raj=new Invoice(34, "ankit", 55);
		Invoice raj1=new Invoice(34, "ankit", 55);
		Invoice ram=new Invoice(44, "an45", 75);
		Invoice shyam=new Invoice(94, "ant", 65);
		
		HashMap<Integer, Invoice> invList= new HashMap<Integer,Invoice>();
		
		invList.put(111, raj); //Autoboxing
		invList.put(new Integer(151), ram);
		Invoice response =invList.put(new Integer(111), raj1);
		invList.put(new Integer(211), shyam);
		System.out.println(response);
		
		System.out.println("Size is "+invList.size());
		
		System.out.println(invList.get(111));
		
		//Cobverting the hash map to a set using entrySet() method
		Set<Map.Entry<Integer, Invoice>> myList= invList.entrySet();
		
		for(Map.Entry<Integer, Invoice>eachEntry:myList)
		{
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
	}

}
