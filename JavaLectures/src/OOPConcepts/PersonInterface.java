package OOPConcepts;

public interface PersonInterface {
	
	// DOC: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
	
	// ===== HOW TO CREATE INTERFACE =====
	// 1.) Right click on package -> New Interface -> Give Name and Finish
	
	// Any variables you instantiate here is static because you cannot create objects in interface
	static final String ORGANIZATION = "Per Scholas";
	
	// Any class IMPLEMENTING THIS INTERFACE will need to follow the structure
	// All methods are defaulted to public
	double calculate(int num);

    int compute(int num1, int num2);
}
