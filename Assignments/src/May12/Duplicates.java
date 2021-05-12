package May12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	static List<Integer> getDuplicateList(List<Integer> list) {
		Set<Integer> resList = new HashSet<Integer>();
		int count = 0;
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > 0) {
				resList.add(array[i]);
			}
			count = 0;
		}

		return resList.stream().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the list");
		int size = sc.nextInt();
		System.out.println("enter the number in the list");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		List<Integer> resList = getDuplicateList(list);

		System.out.println("duplicate values are");
		Iterator<Integer> itr = resList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
