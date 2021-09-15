import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int num = Integer.parseInt(binary); //changes string to int
        int sum = 0; //this is the starting that decimal numbers found will be added to
        int count = 0; // will count the power of the digit as code iterates thought the number
        while(num>0){
            int lastdigit = num%10; //gets last digit of int
            num=num/10; //chops off last digit
            sum += lastdigit*Math.pow(2,count); //gets the last digit and multiplies it by 2 to the power of the place the digit is from right to left
            count++; // increases the power each time goes through one iteration
        }
        return sum; // the decimal
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        String str = "";
        while (decimal>0){
            int remain = decimal%2;
            decimal=decimal/2;
            str = remain + str;
        }
        return str;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String inputstr = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(inputstr));
        System.out.println("Type in a number in decimal format: ");
        int inputdec = scan.nextInt();
        System.out.println("That is equal to the decimal value: " + decimalToBinary(inputdec));


        scan.close();
    }
}
