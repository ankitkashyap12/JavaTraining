package com.services;

import java.io.*;
import com.assignment.CreditCard;



public class Services {
	
	public boolean storeDetails(CreditCard[] card) 
	{
		boolean stored=true;
		ObjectOutputStream outStream=null;
		try {
			
			
			outStream= new ObjectOutputStream(new FileOutputStream(new File("card.ser")));
			for(int i=0;i<card.length;i++)
			{
			outStream.writeObject(card[i]);
			}
			stored=true;
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			
		}
		
		finally
		{
			try {
				outStream.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return stored;
	}
	
	
	
	public boolean storeDetails(File file, CreditCard[] cardList)
	{
		PrintWriter writer= null;
		boolean stored =false;
	
		try {
	 writer=new PrintWriter(new FileWriter(file,true));
	 for(int i=0;i<cardList.length;i++) {
		 
		 writer.println(cardList[i].toString());
	 }
	 stored=true;
	 
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		finally
{
	writer.close();
	
}
		return stored;
	}
	

	
	
	
public CreditCard[]  read()
	
	{
		CreditCard[] card=new CreditCard[4];
		ObjectInputStream in=null;
		try {
			FileInputStream file = new FileInputStream("card.ser"); 
	         in = new ObjectInputStream(file);
	         for (int i=0;i<4;i++)
	         {
	        	 card[i]=(CreditCard) in.readObject();
	         }
	         	         
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			}
			catch(Exception e) {
				
				
			}
		}
		return card;
	
	
	}


public CreditCard[] readFromFile(File file)
{
	BufferedReader reader= null;
	CreditCard[] cards=new CreditCard[10];
	int i=0;
	try {
		 reader=new BufferedReader(new FileReader(file));
		 
		 String line;
		 while((line=reader.readLine())!=null )
		 {
			 System.out.println(line);
			String[] arr=line.split(",");
//			System.out.println("Arr is: "+ arr.length);
			CreditCard card=new CreditCard();
//			System.out.println("arr[1]: "+arr[1]+"  arr[0]  " +arr[0]+" arr[2] "+arr[2]+"\n");
			card=new CreditCard();
			card.setCardHolderName(arr[0]);
			card.setCustomerId(Integer.parseInt(arr[1]));
			card.setCardNumber(Integer.parseInt(arr[2]));
			cards[i]=card;
			i++;
				}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
	{
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return cards;


}


public CreditCard[] delete(CreditCard[] cards, String customerName)
{
//	CreditCard[] temp=new CreditCard[23]
	int arr_length=cards.length;
	System.out.println("original length: "+ arr_length);
	int i=0;
	for ( i=0;i<cards.length;i++)
	{
		if(cards[i].getCardHolderName().equalsIgnoreCase(customerName))
		{
			cards[i]=cards[arr_length-1];
			arr_length--;
			System.out.println("deleted sucessfully");
			break;
		}
		if(i==arr_length)
		{
			System.out.println("Not found");
		}
	
	}
	System.out.println("  length after deletion:   "+ arr_length+ "  deleted at position "+i);
	return cards;
}

public boolean store(CreditCard[] cards, File file, int type) {
	return type==1?storeDetails(cards):storeDetails(file,cards);		
}

public CreditCard[] retrieve(int type,File file) {
	return type==1?read():readFromFile(file);


}
}

