package May12;

import java.util.*;
import java.util.stream.Collectors;

public class ListSorter {

	public static List<Integer> getSortedList(List<Integer> list) {

		List<Integer> reslist = list.stream().sorted().collect(Collectors.toList());

		return reslist;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter size of the list");
		int size = sc.nextInt();

		System.out.println("enter the values");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}

		List<Integer> reslist = getSortedList(list);
		String res = "";
		for (Integer x : reslist) {
			res += x + " ";
		}

		System.out.println(res);

	}

}
