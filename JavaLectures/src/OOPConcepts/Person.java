package OOPConcepts;
// ===== WHAT IS INHERITANCE? =====
	/*
	 * • A class that can inherit properties and methods from other class. Instance
	 * variables and methods* 
	 * • Interviewer: Constructor is never inherited. Each
	 * class has their own constructor. 
	 * • A class becomes a superclass or a parent
	 * class if it's being inherited. 
	 * • A class that inherits from a parent class is
	 * called a subclass.
	 */
    public class Person {
        // =================================================================
        // ===== WHAT IS A CLASS? =====
        // • Template/blueprint to create an object
        
        // ===== HOW DO WE DEFINE OBJECT? =====
        // • Characteristics of object: every object has a state/properties and methods
        // • State is a characteristic of an object
        // • Method is a variable of an object
        
        // ===== HOW DO WE DEFINE A METHOD? =====
        // • Consist of business logic which consists of one purpose/task
        
        // ===== SIDE NOTES =====
        // Not every class needs to be instantiated.
        // Not all classes will have methods and variables.
        
        // =================================================================
        
        // ===== STATIC VARIABLES =====
        // Created at the class level
        // Variables that have a default value
        // Note: we use the static identifier, final you can't change the value of (similar to const)
        static final String INSTITUTION = "Per Scholas";
        static String Course_name = "Software Engineering";
        static String Quote = "Breathe. You got this.";
        static String Teo = "Not Teo leaving messages for all of you if you're following through his notes. Trying to bring in smiles. :)";
        static int count;
        
        // ===== INSTANCE VARIABLES =====
        // These are not similar to your local variables
        // It's not best practice to put default values.
        // Properties that belong to eachPerson but the value are different to each Person.
        String pname;
        int page;
        char pgender;
        
        // ===== CONSTRUCTORS =====
        // Creating empty constructor - this is constructing an object.
        // Compiler can create an empty constructor for us if we don't create it.
        // This is called Constructor overloading. To test this out comment out the public Person() and the public Person(parameters...)
        // HOT TIP FOR INTERVIEW: If you are creating parametized constructor WE HAVE TO CREATE an empty constructor. If we don't need to create parametized constructor, we can omit writing the both of them.
        // Constructor declarations look like method declarations—except that they use the name of the class
        public Person() {
            count++;
        }
        
        // Creating parametized constructor
        // Why would we need to create parametized constructor? Let's say we have many instance variables. This way we can pass on only the variables we want to associate with this specific constructor.
        // And yes, we have can have multiple constructors.
        // CONVENTION: should be called the same as our instance variables
        public Person(String pname, int page, char pgender) {
            this.pname = pname;
            this.page = page;
            this.pgender = pgender;
            count++;
        }
        
        public Person(String pname, int page) {
            this.pname = pname;
            this.page = page;
            count++;
        }
        
        // Instance method or non-static method - needs to be invoked with object references. If you invoke this without object reference you will get compiler error. For example p1.display() is what you would need and display() will get an error.
        void display() {
            System.out.println("Name: " + this.pname);
            System.out.println("Gender: " + this.pgender);
            System.out.println("Age: " + this.page);
        }
        
        // Static can be called without object references
        // This is a class method.
        // REMEMBER: void just means our method is not returning anything
        static void info() {
            System.out.println("Information about person class...");
            System.out.println("----------------");
        }
        public void display(Person obj) {
            System.out.println("Within parameterized display...");
            System.out.println("Name: " + obj.pname);
        }
        double calculate(int num) {
            System.out.println("Calculate inside parent (Person) class");
            return 121.33;
        }

        public static void totalPerson(){
            
        }
        // ===== MAIN METHOD =====
        
        public static void main(String[] args) {
            info();
            
            // Calling constructor
            Person p1 = new Person();
            
            p1.pname = "John";
            p1.page = 20;
            p1.pgender = 'M';  // note the single quotes
    
            
            p1.display();
            
            System.out.println("----------------");
            
            Person p2 = new Person();
            
            p2.pname = "Amy";
            p2.page = 22;
            p2.pgender = 'F';  // note the single quotes
            
            p2.display();
            
            System.out.println("----------------");
            
            // We are using the parametized constructor
            Person p3 = new Person("Carlos", 33, 'M');
            
            p3.display();
            
            System.out.println("----------------");
            
            // You can mix both ways to create a Person
            Person p4 = new Person("Teo", 23);
            
            p4.pgender = 'M';
            
            p4.display();
            System.out.println(count);
            // You can create as many objects as you want. We are creating instantiations of Person Class. Each person will have different values. 
        }
    
    }
