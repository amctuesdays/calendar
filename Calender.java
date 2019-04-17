import java.util.Scanner;

public class Calender {
	// This program has a git repository 
	
	public static void main(String[] args) {
		
		System.out.println("Enter the month [enter], then the year [enter]: ");
		Scanner userinput = new Scanner(System.in);
		int month = userinput.nextInt();
		int year = userinput.nextInt();
		printMonthTitle(month);
		printMonthBody(month, year);
	}
	
	public static void printMonthTitle(int month) {
		String monthTitle = "";
		
		switch (month) {
		case 01: monthTitle = "January"; break;
		case 02: monthTitle = "February"; break;
		case 03: monthTitle = "March"; break;
		case 04: monthTitle = "April"; break;
		case 05: monthTitle = "May"; break;
		case 06: monthTitle = "June"; break;
		case 07: monthTitle = "July"; break;
		case 8: monthTitle = "August"; break;
		case 9: monthTitle = "September"; break;
		case 10: monthTitle = "October"; break;
		case 11: monthTitle = "November"; break;
		case 12: monthTitle = "December";break;
		}
		
		System.out.println("\t     " + monthTitle + "\n");
		System.out.println("S    M    T    W    T    F    S");
		System.out.println("---------------------------------");
	}

	public static void printMonthBody(int month, int year) {
				
		int daysInMonth = getNumberOfDaysInMonth(month, year);
		int startDay = getStartDay(month, year);
		int x = 0;
		String s = "";
				
		for (x = 0; x < startDay; x++)
				System.out.printf("%-5s", s);

		for (int i = 1; i <= daysInMonth; i++) {
			
			if ((i + x) % 7 == 0)
				System.out.printf("%-5d" + "\n", i);
			else 
				System.out.printf("%-5d", i);
		}		
	}
	
	public static int getStartDay(int month, int year) {
		int k = 01;
		int m = 0;
		int C;
		int D;
		int f;
		D = year % 100;
		C = year / 100;
		int startDay;
		
		switch (month) {
		case 01: m = 11; break;
		case 02: m = 12; break;
		case 03: m = 01; break;
		case 04: m = 02; break;
		case 05: m = 03; break;
		case 06: m = 04; break;
		case 07: m = 05; break;
		case 8: m = 06; break;
		case 9: m = 07; break;
		case 10: m = 8; break;
		case 11: m = 9; break;
		case 12: m = 10; break;
		}
		
		if (m == 11 || m == 12)
			D -= 1;
		
		f = k + ((13 *m - 1) / 5) + D + (D / 4) + (C / 4) - 2 * C;
		
		if (f < 0) {
			startDay = (f % 7);
			if (startDay != 0)
				startDay += 7;
		}
		else
			startDay = f % 7;
		
		return startDay;
	}
			
	public static int getNumberOfDaysInMonth(int month, int year) {
		int daysInMonth = 0;
		
		switch (month) {
		case 01: daysInMonth = 31; break;
		case 02: daysInMonth = 28; break;
		case 03: daysInMonth = 31; break;
		case 04: daysInMonth = 30; break;
		case 05: daysInMonth = 31; break;
		case 06: daysInMonth = 30; break;
		case 07: daysInMonth = 31; break;
		case 8: daysInMonth = 31; break;
		case 9: daysInMonth = 30; break;
		case 10: daysInMonth = 31; break;
		case 11: daysInMonth = 30; break;
		case 12: daysInMonth = 31; break;
		}
		
		if (month == 02) {
			boolean leapYear = isLeapYear(year);
			if (leapYear)
				daysInMonth = 29;
		}
		
		return daysInMonth;
	}
	
	public static boolean isLeapYear(int year) {
		boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
		return leapYear;
	}

}
