package OOPConcepts;

public class Starter {
    public static void main(String[] args) {
		// Making Student Objects
		Address addr;
		
		Student student1 = new Student(101, "Vegeta", 99, 'M', 100.0, 98.5, 99.0);
		
		// This display method is being called from our Student class
		// student1.display();

		Employee empl1 = new Employee(001, "john", 24, 'M', 100.25);
		empl1.display();
		empl1.calculate(5000);

	}
}
