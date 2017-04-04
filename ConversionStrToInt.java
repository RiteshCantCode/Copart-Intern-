package convert.string.to.Integer.Simple;

import java.util.Scanner;

public class ConversionStrToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner input = new Scanner(System.in);
		String numberTobeConverted = input.nextLine();
		int number = myStringToInteger(numberTobeConverted);
		System.out.println("String decoded to number " + number);
		input.close();
	}

	public static int myStringToInteger(String str) {
	    int result = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        result += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
	    return result;
	}
}
