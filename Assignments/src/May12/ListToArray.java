package May12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArray {
	public static int[] listToArray(List<Integer> list) {
		int[] arr = list.stream().mapToInt(Integer :: intValue).toArray();
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of list");
		int size = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("enter the elements");
		for(int i = 0 ; i<size;i++ ) {
			list.add(sc.nextInt());
			
		}

		int[] arr = listToArray(list);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
