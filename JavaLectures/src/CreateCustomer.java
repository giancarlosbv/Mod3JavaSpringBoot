public class CreateCustomer {
    
    
    public static void main(String[] args) {
        Customer c1= new Customer();
        
        		
        
        // CHECK THIS OUT
		// Since our classes our inside our package, it has access to each other.
		
		// Here we are setting values using our setter methods inside our Customer.java
		// Currently we are hardcoding values, but this may be a place to take in user input
		c1.setName("Bobby");
		c1.setEmail("bobby@gmail.com");
		c1.setAddress("123 Sesame Street");
		
		// Here we are grabbing the values using our getter methods inside our Customer.java
		System.out.println("Name: " + c1.getName());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Address: " + c1.getAddress());
        System.out.println("Id: " + c1.getId());
        
        Customer c2 = new Customer();
        c2.setName("Scooby Doo");
        c2.setEmail("ScoobySnackEnjoyer@gmail.com");
        c2.setAddress("The Mystery Machine");
        


        System.out.println("Name: " + c2.getName());
        System.out.println("Email: " + c2.getEmail());
        System.out.println("Address: " + c2.getAddress());
        System.out.println("Id: " + c2.getId());


    }
}