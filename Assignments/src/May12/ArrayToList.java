package May12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	public static List<Integer> ConvertToList(int[] arr){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr) {
			list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements: ");
		for(int i = 0 ; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		List<Integer> list = ConvertToList(arr);
		System.out.println(list);
	}

}
