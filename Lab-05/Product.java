class Product{

	private String name = null;
	private int quantity = 0;
	private double price = 0;

	Product(String name, int quantity,double price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	String getName(){
		return name;
	}

}