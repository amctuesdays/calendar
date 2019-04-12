package level01;

import java.util.Scanner;

public class Calander {

	private static Scanner userinput;

	public static void main(String[] args) {
		userinput = new Scanner(System.in);
		System.out.print("Enter the month using the format 01-12:");
			byte month = userinput.nextByte();
		System.out.print("Enter the year: ");
			short year = userinput.nextShort();
		printCalender(month, year);
	}

	public static void printCalender(byte i1, short i2){
		System.out.println("\t     " + printMonth(i1,i2));
		System.out.println("---------------------------------");
		System.out.println(i2);
	}

	public static String printMonth(byte i1, short i2){ 
		String month = "";
		i2 += i2;
		
		switch (i1){
			case 01: month = "January"; break;
			case 02: month = "February"; break;
			case 03: month = "March"; break;
			case 04: month = "April"; break;
			case 05: month = "May"; break;
			case 06: month = "June"; break;
			case 07: month = "July"; break;
			case 8: month = "August"; break;
			case 9: month = "September"; break;
			case 10: month = "October"; break;
			case 11: month = "November"; break;
			case 12: month = "December"; break;
		}
		return month;
	}

}
