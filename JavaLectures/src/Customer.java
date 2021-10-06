public class Customer {
	static int idGen = 1;
	private String name;
	private int id;
	private int invoice;
	private String address;
	private String email;
	
	public Customer(){
		this.id = idGen++;
	}
	// Click anywhere in your code -> click source -> click on Generate Getters and Setters...
	// Choose which ones you want to generate in the list -> click Generate...
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInvoice() {
		return invoice;
	}
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

    /**
     * @return int return the id
     */
    public int getId() {
		
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
		
    }

}