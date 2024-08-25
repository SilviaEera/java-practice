package oop;
// USING CONSTRACTOR


class Product{
	private int itemNo;
	private String name;
	private double price;
	private int quantity;
	
	//getters and setters 
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getItemNo() {
		return itemNo;
	}
	
	
	
	public Product(int itemNo, String name) {
		this.itemNo = itemNo;
		this.name = name; 
	}
	
	public String toString() {
		return "{ " + "\n" +" Name : "  + name + "\n" + " Price : " + price + "\n" + " Item Number : " + itemNo + "\n" + " Item in stock : "  + quantity + "\n" + "}";
	}
	
}

class Custormer{
	private int customerId;
	private String name;
	private String address;
	private String phoneNumber;
	
	
//	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	
//	
	
	public Custormer(int customerId, String name, String phoneNumber) {
//		super();
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
public class Shop {
	
	public static void main(String[] args) {
		
		Product p = new Product(321, "Sunsilk Shampoo");
		p.setPrice(300);
		p.setQuantity(100);
		
		System.out.println(p);
		
	}

}
