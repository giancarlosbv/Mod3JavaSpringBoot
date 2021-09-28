public class Hello {
    public static void main(String args[]) {
        // int inum = 10;
        // float fnum = 10.34f;
        // double dnum = 63623737.37;
        // char onechar = 'A';
        // String sentence = "Use double quotes for strings";
        // boolean choice = true;

        int num1 = 5;
        int num2 = 10; 
        // 1. Add, subtract, multiply, and divide (quotient & remainder) two numbers and display the output
        System.out.println(num1+num2+" addition");
        System.out.println(num1-num2+" subtraction");
        System.out.println(num1/num2+" division");
        System.out.println(num1*num2+" multiplication");
        System.out.println(num1%num2+" remainder");

        //2. Swap two numbers: Store two numbers in separate variables, display their initial values, swap them, and display them again.

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1+"swap1"); //num1 = 10
        System.out.println(num2+"swap2"); //num1 = 5




            // a = 11
            // b = 7
            // temp = a
            // a = b
            // b = temp

            // print(a) # 7
            // print(b) # 11

        // System.out.println("Hello World!!!!" + onechar);
        // System.out.println(inum);
        // System.out.println(fnum);
        // System.out.println(dnum);
        // System.out.println(onechar);
        // System.out.println(choice);
        // System.out.println(sentence);
    }
}