package May12;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCopy {
	public static int CopySets(Set<Integer> source, Set<Integer> destination) {

		if (source == null||destination == null) {
			return 1;
		} else {
			destination.addAll(source.stream().collect(Collectors.toSet()));
			System.out.println("destination after copying");
			destination.stream().forEach(System.out::println);
			return 0;

		}

	}

	public static void main(String[] args) {

		Set<Integer> source = new HashSet<Integer>();

		Set<Integer> destination = new HashSet<Integer>();

		source.add(100);
		source.add(101);
		source.add(202);
		destination.add(102);
		destination.add(103);
		System.out.println("Source set before copying: ");
		source.stream().forEach(System.out::println);
		
		System.out.println("destination before copying");
		destination.stream().forEach(System.out::println);

		int res = CopySets(source, destination);
		if (res == 0) {
			System.out.println("Copy Successful " + res);
		} else {
			System.out.println("copy Not Successful "+res);
		}

	}

}
