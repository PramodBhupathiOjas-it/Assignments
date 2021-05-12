package May12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayToMap {
	public static Map<Integer, String> ConvertToMap(String[] names){
		Map<Integer,String> namesMap = new HashMap<Integer, String>();
		for(int i=0;i<names.length;i++) {
			namesMap.put(i+1, names[i]);
		}
		
		return namesMap;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("enter the elements: ");
		for(int i = 0 ; i < size;i++) {
			arr[i] = sc.next();
		}
		Map<Integer, String> resMap = ConvertToMap(arr);
		System.out.println("elements in map");
		for(Map.Entry<Integer, String> entry : resMap.entrySet()) {
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
		
	}

}
