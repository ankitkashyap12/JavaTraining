package day1;

public class Application {
	public static void main( String[] args){
	Greeting grtObj =new Greeting();
	System.out.println(grtObj.getMessage());
	Book headFirst =new Book();
	headFirst.setBookNumber(100);
	Book spring= new Book(234, "spring ", "me", 500);
	System.out.println(spring.getAuthorName());
	System.out.println(headFirst.getBookNumber());
}

	
}