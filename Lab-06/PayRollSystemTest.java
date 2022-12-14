class Employee{

	private String firstName = null;
	private String lastName = null;
	private String nic = null;

	Employee(){}

	Employee(String firstName,String lastName,String nic){
		this.firstName = firstName;
		this.lastName = lastName;
		this.nic = nic;
	}

	void setFirstName(String firstName){
		this.firstName = firstName;	
	}
	String getFirstName(){
		return firstName;
	}

	void setLastName(String lastName){
		this.lastName = lastName;
	}
	String getLastName(){
		return lastName;
	}

	void setNic(String nic){
		this.nic = nic;
	}
	String getNic(){
		return nic;
	}
	

	public String toString(){
		String data = "First Name : "+firstName+"\nLast Name :"+lastName+"\nCNIC : "+nic;
		return data;
	}

	public double earning (){
		return 0.00;
	}


}


class SalariedEmployee extends Employee{

	private double weeklySalary = 0;

	SalariedEmployee(){}

	SalariedEmployee (String firstName,String lastName,String nic,double weeklySalary){
		super(firstName,lastName,nic);

		if(weeklySalary >= 0)
			this.weeklySalary = weeklySalary;
		else
			System.out.println("It can not be negative");
	}	

	void setWeeklySalary(double weeklySalary){

		if(weeklySalary >= 0)
			this.weeklySalary = weeklySalary;
		else
			System.out.println("It can not be negative");		
	}

	double getWeeklySalary(){

		return weeklySalary;
	}

	public String toString(){
		return "\nSalaried Employee\n"+super.toString();
	}
	
	public double earning(){
		return weeklySalary;
	}

}


class HourlyEmployee extends Employee{

	private double wages = 0;
	private double hours = 0;

	HourlyEmployee(){}

	HourlyEmployee(String firstName,String lastName,String nic,double wages,double hours){
		super(firstName,lastName,nic);
		if(wages >=0)
			this.wages = wages;
		else
			System.out.println("It can not be negative");

		if(hours >=0)		
			this.hours = hours;
		else
			System.out.println("It can not be negative");		
	}

	void setWages(double wages){
		if(wages >=0)
			this.wages = wages;
		else
			System.out.println("It can not be negative");
	}
	
	double getWages(){
		return wages;
	}

	void setHours(double hours){
		
		if(hours >=0)		
			this.hours = hours;
		else
			System.out.println("It can not be negative");
	}

	double getHours(){
		return hours;
	}

	
	public String toString(){
		
		return "\nHourly Employee\n"+super.toString();
	}

	public double earning(){
		double earn = 0;

		if(hours <=40)
			earn = hours * wages;
		else
			earn = 40 * wages + (hours-40)*wages*1.5;

		return earn;
	}


}


class CommissionEmployee extends Employee{

	private double grossSales = 0;
	private double commissionRate = 0;

	CommissionEmployee(){}

	CommissionEmployee (String firstName,String lastName,String nic,double gross,double commission){

		super(firstName,lastName,nic);
		grossSales = gross ;
		commissionRate = commission;		
	}

	void setGrossRate(double gross){

		if(gross >=0)
			grossSales = gross;
		else
			System.out.println("It can not be negative");
	}
	
	double getGrossSales(){
		return grossSales;
	}

	void setCommissionRate(double commission){

		if(commission >=0)
			commissionRate = commission;
		else
			System.out.println("It can not be negative");
	}

	double getCommissionRate(){
		return commissionRate;
	}


	public String toString(){
		return "\nCommissionEmployee\n"+super.toString();
	}

	public double earning(){
		return grossSales*commissionRate;
	}

}


class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary = 0;
	
	BasePlusCommissionEmployee(){}

	BasePlusCommissionEmployee (String firstName,String lastName,String nic,double gross,double commission,double baseSalary){

		super(firstName,lastName,nic,gross,commission);
		this.baseSalary = baseSalary;
	}	

	void setBaseSalary(Double salary){

		if(salary >=0)
			baseSalary = salary;
		else
			System.out.println("It can not be negative");
	}

	double getBaseSalary(){
		return baseSalary;
	}

	public String toString(){
		return "\nBase Plus Commission Employee\n"+super.toString();
	}

	public double earning(){
		return (baseSalary+super.earning());
	}

}



public class PayRollSystemTest{

  public static void main(String args[]){

	System.out.println("UpCasting : \n");

	Employee Employee1st = new SalariedEmployee("Muhammad","Ali","11111-1111111-1",800.00);
	Employee Employee2nd = new CommissionEmployee("Tarwan","Kumar","22222-2222222-2",10000.00,0.06);
	Employee Employee3rd = new BasePlusCommissionEmployee("Fabeeha","Fatima","22222-22223332-3",5000.00,0.04,300);
	Employee Employee4th = new HourlyEmployee("Hasnain","Ali","44444-4444414-4",16.75,40);

	System.out.println(Employee1st);
	System.out.println("Salary : "+Employee1st.earning());
	
	System.out.println(Employee2nd);
	System.out.println("Salary : "+Employee2nd.earning());

	System.out.println(Employee3rd);
	System.out.println("Salary : "+Employee3rd.earning());

	System.out.println(Employee4th);
	System.out.println("Salary : "+Employee4th.earning());

	
	System.out.println("\n\nDownCasting : \n");

	BasePlusCommissionEmployee currentEmp = (BasePlusCommissionEmployee) Employee3rd;

	double oldBaseSalary = currentEmp.getBaseSalary();
	System.out.println("Old base Salary : "+oldBaseSalary);

	currentEmp.setBaseSalary(1.1 * oldBaseSalary);	

	oldBaseSalary = currentEmp.getBaseSalary();
	System.out.println("new base Salary with 10% increase : "+oldBaseSalary);	

	System.out.println(Employee3rd);
	System.out.println("Salary : "+Employee3rd.earning());
  }

}