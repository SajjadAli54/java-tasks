import java.util.*;
class Store{

	private String name = null;
	private String location = null;
	private Product productList[] = new Product[100];
	private int nbProduct = 0;

	Store(String name, String location){
		this.name = name;
		this.location = location;
	}

	String getName(){
		return name;
	}

	void addProduct(Product p){
		if(nbProduct < 100)
			productList[nbProduct++]=p;
		else
			System.out.println("It has reached its limit.");	
	}

	boolean searchProduct(String productName){
		for(Product p : productList){
			if(p.getName() == productName)
				return true;
		}
		return false;
	}

	Product deleteProduct(String productName){
		Product p = null;
		for(int i=0;i<nbProduct;i++){
			if(productList[i].getName()==productName){
				p = productList[i];
				for(int j=i+1;i<nbProduct-1;j++,i++){
					productList[i] = productList[j];
				}
				nbProduct--;
				return p;
			}
		}
		return p;
	}

	void displayAll(){
		System.out.println("Products List");
		for(int i=0;i<nbProduct;i++){
			System.out.println((i+1)+"  :  "+productList[i].getName());
		}
	}

}