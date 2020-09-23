/**
 * 
 */
package com.training.util;

import java.util.Comparator;

import com.training.Invoice;

/**
 * @author ankit
 *
 */
public class CustomerNameSort implements Comparator<Invoice> {

	@Override
	public int compare(Invoice obj1, Invoice obj2) {
//		if(obj1.getCustomerName() > obj2.getCustomerName()) return -1;
//		if(obj1.getCustomerName() < obj2.getCustomerName()) return 1;
		return obj1.getCustomerName().compareTo(obj2.getCustomerName());
	}
	

}
