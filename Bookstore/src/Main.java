import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
////		
//		//this will return the memory location UNTIL WE OVERIDEGENERATE TO STRING ON THE BOOKSTORE FILE !!!!!!!
////		
//		Bookstore myBookstore = new Bookstore("Lynea's Bookstore Cafe", " Main street, NY.NY", 2500, true, false, 9, 10);
//		System.out.println(myBookstore);

	
		Bookstore bookstore =new Bookstore();
		Scanner scanner = new Scanner (System.in);
		
		String storeAddress;
		String storeName;
		String storeOpen;
		String storeClose;
		String storeSize;
		String storeUsed;
		boolean complete = false;
		
		ArrayList<Bookstore> bookstoreList = new ArrayList <Bookstore>();
		
		while (complete == false ) {
		System.out.println ("What is the Address ? ");
		storeAddress = scanner.nextLine();
		System.out.println(" Is the store open today ?");
		storeOpen = scanner.nextLine();
		System .out.println("What time do you close?");
		storeClose = scanner .nextLine();
		System.out.println("How big is the store?");
		storeSize =scanner.nextLine();
		System.out.println("Does the store have Used books?");
		storeUsed = scanner.nextLine();
		break;
		
		
		
		}
		
		for (Bookstore b : bookstoreList) {
			System.out.println("");
		
	}
	}
}
