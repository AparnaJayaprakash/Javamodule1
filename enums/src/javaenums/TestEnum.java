package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+ today.getName() + "!");
		
		
		switch(today) {
		
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little more");
			break;
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
		case THURSDAY:
			System.out.println("Work work work, WEEKEND IS ARRIVING");
			break;
		case FRIDAY:
			System.out.println("Yeahh!! weekend has arrived party hard");
			break;
		case SATURDAY:
			System.out.println("Enjoy morning coffee, go shopping");
			break;
		case SUNDAY:
			System.out.println("do ALL CLEANING WORKS, SNOOOOOOOOOOOZZZZZZZZZZZ.....!!!");
			break;
		}
		
	}

}
