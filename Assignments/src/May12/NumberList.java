package May12;

import java.util.*;
import java.util.Scanner;

public class NumberList {

	static String display(String str) {
		String res = " ";
		str = str.replaceAll("-", ",");
		// str = str.replaceAll(","," ");
		String[] string = str.split(",");
		int[] intArray = new int[string.length];
		for (int i = 0; i < string.length; i++) {
			intArray[i] = Integer.parseInt(string[i]);
		}

		Arrays.sort(intArray);

		int min = intArray[0];
		int max = intArray[intArray.length - 1];

		for (int i = min; i <= max; i++) {
			res += i+" ";
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value");
		String str = sc.next();
		System.out.println(display(str));

	}

}
