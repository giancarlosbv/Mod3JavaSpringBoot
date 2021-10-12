package OOPConcepts;

public class Employee extends Person implements PersonInterface {
	
	int emp_id;
	double emp_salary;
	// Notice the object reference from Address class
	// In here we are declaring addr variable
	// In here we create an instance variable so we can use it in any method in this class.
	// If we were to put it inside our createAddress() method it will only be accessible to that method.
	// This will ensure that we are not writing Address addr = new Address(); inside many methods.
	// You can check this out, if you delete our Address addr in top level, and add it inside createAddress().
	// We will get an error in display() because we can no longer access our object reference addr.street...etc.
	Address addr;
	
	Employee(int id, String name, int age, char gender, double salary) {
		
		super(name, age, gender);
		// This cannot link to the operator so we would need to use object reference like instantiating Address
		this.emp_id = id;
		this.emp_salary = salary;
		
	}
	
	public void createAddress() {
		
		// Take user input for this Employee's address fields
		addr = new Address();
		
		// Currently hard coding
		addr.street = "101 South St.";
		addr.city = "Queen City";
		addr.state = "OH";
		addr.zipcode = 78686;
		
	}
	
	public void display() {
		
		System.out.println(ORGANIZATION);
		System.out.println("-----------");
		System.out.println("Id: " + this.emp_id);
		super.display();
		// we are associating our Employee with the Address method
		// We do this by using our object reference addr
		// Since we are displaying together, they are associating with each other
		// ===== WHY DO WE HAVE ADDRESS CLASS =====
		// • Reusability so any people can have their own address :) 
		System.out.println(addr.street);
		System.out.println(addr.city);
		System.out.println(addr.state);
		System.out.println(addr.zipcode);
		System.out.println("Salary: " + this.emp_salary);
		System.out.println();
		
	}
	
	public double calculate(int bonus) {
		
		double netsalary = bonus + this.emp_salary;
		return netsalary;
		
	}
    // Fulfilling interface
	public int compute(int num1, int num2) {
		
		int time = num2 - num1;
		return time;
		
	}
    
}