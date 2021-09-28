public class Hello {
    public static void main(String args[]) {
        // int inum = 10;
        // float fnum = 10.34f;
        // double dnum = 63623737.37;
        // char onechar = 'A';
        // String sentence = "Use double quotes for strings";
        // boolean choice = true;

        int num1 = 13;
        int num2 = 7;
        // 1. Add, subtract, multiply, and divide (quotient & remainder) two numbers and
        // display the output
        System.out.println(num1 + num2 + " addition");
        System.out.println(num1 - num2 + " subtraction");
        System.out.println(num1 / num2 + " division");
        System.out.println(num1 * num2 + " multiplication");
        System.out.println(num1 % num2 + " remainder");

        // 2. Swap two numbers: Store two numbers in separate variables, display their
        // initial values, swap them, and display them again.

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + "swap1"); // num1 = 10
        System.out.println(num2 + "swap2"); // num1 = 5

        // 3. Display the average of five numbers: Create five separate variables
        // holding different numbers and find the average

        int average1 = 55;
        int average2 = 45;
        int average3 = 35;
        int average4 = 25;
        int average5 = 15;

        System.out.println("Average: " + (average1 + average2 + average3 + average4 + average5) / 5);

        // 4. Write a Java program that display the larger of two integers. Store these
        // numbers in variables.

        int size1 = 12;
        int size2 = 17;
        if (size1 > size2) {
            System.out.println(size1 + " is larger");
        } else {
            System.out.println(size2 + " is larger");
        }

        // 5. Display the largest of three numbers.
        int big1 = 12;
        int big2 = 17;
        int big3 = 20;

        if (big1 > big2 && big1 > big3) {
            System.out.println(big1 + " is the largest");
        } else if (big2 > big1 && big2 > big3) {
            System.out.println(big2 + " is the largest");
        } else {
            System.out.println(big3 + " is the largest");

        }

        // 6. Determine if a number is negative, positive, or zero. 
        int pNum = -10;
        // int nNum = -10;
        // int zero = 0;

        if (pNum > 0) {
            System.out.println(pNum + " is positive");
        } else if (pNum < 0) {
            System.out.println(pNum + " is negative");
        } else {
            System.out.println((pNum + "is zero"));
        }

        


        // System.out.println("Hello World!!!!" + onechar);
        // System.out.println(inum);
        // System.out.println(fnum);
        // System.out.println(dnum);
        // System.out.println(onechar);
        // System.out.println(choice);
        // System.out.println(sentence);
    }
}

// a = 11
// b = 7
// temp = a
// a = b
// b = temp

// print(a) # 7
// print(b) # 11