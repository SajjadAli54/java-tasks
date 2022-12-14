class Company{

	private String name = null;
	private Store arrayStore[] = new Store[10];
	private int nbStore = 0;

	Company(String name){
		this.name = name;
	} 

	void addStore(Store s){
		if(nbStore < 10)
			arrayStore[nbStore++] = s;
		else
			System.out.println("There is end.");
	}

	int searchNbStore(String product){
		int count =0;
		for(int i=0;i<nbStore;i++){
			if(arrayStore[i].searchProduct(product))
				count++;
		}
		return count;
	}

	void displayAll(){
		System.out.println("Stores of the company : ");
		for(int i=0;i<nbStore;i++){
			System.out.println(arrayStore[i].getName());
		}
	}

}