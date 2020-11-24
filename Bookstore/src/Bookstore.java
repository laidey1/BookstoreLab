import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {
	private String name;
	private String address;
	private int squarefeet;
	private boolean usedbooks = true;
	private boolean open = false;
	private int openingtime;
	private int closingtime;
	private ArrayList<String> titles;
	
	//constructor declaring the value of each variable
	public Bookstore (String name, String address, int squarefeet, boolean usedbooks, boolean open, int openingtime, int closingtime ) {
		this.name = name;
		this.address = address;
		this.squarefeet = squarefeet;
		this.usedbooks = usedbooks;
		this.open = open;
		this.openingtime = openingtime;
		this.closingtime = closingtime;
		
	}
	//empty constructor   
	public Bookstore() {
		
	}
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSquarefeet() {
		return squarefeet;
	}
	public void setSquarefeet(int squarefeet) {
		this.squarefeet = squarefeet;
	}
	public boolean isUsedbooks() {
		return usedbooks;
	}
	public void setUsedbooks(boolean usedbooks) {
		this.usedbooks = usedbooks;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public int getOpeningtime() {
		return openingtime;
	}
	public void setOpeningtime(int openingtime) {
		this.openingtime = openingtime;
	}
	public int getClosingtime() {
		return closingtime;
	}
	public void setClosingtime(int closingtime) {
		this.closingtime = closingtime;
	}
	
	//overide go to: source generate toString to tell computer to return the variables , not the memory location
		
	@Override
	public String toString() {
		return "Bookstore name=" + name + ", \n address =" + address + ", \n squarefeet =" + squarefeet + ", \n usedbooks ="
				+ usedbooks + ", \n open =" + open + ", \n openingtime =" +  openingtime + ", \n closingtime=" + closingtime + " ";
	}
	
	public void loadTitles() {
		
		try {
			Utils.loadStringstoArray(this.titles);
		} catch (IOException e) {
			System.out.println("Titles");
			this.titles = new ArrayList<String>();
		}
	}
	
}
