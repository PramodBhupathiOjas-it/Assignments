package May12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {

	static int compareDates(Date date1, Date date2) {
		int result = -1;
		if (date1.after(date2)) {
			result = 2;

		} else if (date1.before(date2)) {
			result = 1;
		} else if (date1.equals(date2)) {
			result = 0;
		}
		return result;
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdfo = new SimpleDateFormat("dd-MM-yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter  two date to compare");
		Date date1 = sdfo.parse(sc.next());
		Date date2 = sdfo.parse(sc.next());

		int res = compareDates(date1, date2);
		if (res == -1) {
			System.out.println("dates are null");
		} else if (res == 0) {
			System.out.println(" Both Dates are equal ");
		} else if (res == 1) {
			System.out.println("firstDate is before secondDate");
		} else if (res == 2) {
			System.out.println("firstDate  is after secondDate");
		}

	}

}
