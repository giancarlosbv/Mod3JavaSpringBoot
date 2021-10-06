import java.util.Scanner;
// import java.util.Arrays;
public class Arrays {
    public static void array(){
        int[] a = new int[]{-4,-1,0,5,10};
        int[] b = new int[a.length];
        b = a;
        for (int i=0;i<a.length;i++){
            b[i] = a[i];
        }
        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+ ", ");
        }
    }
    public static void main(String[] args) throws Exception {
    //    String array[] = {"Hector", "Patrick", "Ahmed", "Hector", "Hector", "Patrick" };
       Scanner scanner = new Scanner(System.in);
       String array[] = {};

       System.out.println("Enter the words in the array: ");
       String words = scanner.nextLine();

       array = words.split(" ");

       System.out.println("Enter a name: ");
       String name = scanner.nextLine();
       scanner.close();

       int counter = 0;
       for (int i =0; i<array.length; i++) {
           if (name.equals(array[i]))
           counter++;
       }

       System.out.println("The name you entered " + name + " was entered " + counter + " times");

       ///////////////////////////////////////////////////////////////////////////////////////

    }
}
