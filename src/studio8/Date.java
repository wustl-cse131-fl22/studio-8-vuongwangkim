package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}

	/**
	 * Creates new date object
	 * @param m month integer
	 * @param d day integer
	 * @param y year integer
	 * @param ih isHoliday boolean
	 */
	public Date(int m, int d, int y, boolean ih) {
		
		month = m;
		day = d;
		year = y;
		isHoliday = ih;
	}

    public static void main(String[] args) {
    	Date a = new Date(12, 31, 2020, true);
    	Date b = new Date(12, 31, 2020, true);
    	
    	// tostring
    	System.out.println(a.toString());
    	System.out.println(b.toString());
    	
    	// equals
    	System.out.println(a==b);
    	System.out.println(a.equals(b));
    	
    	// hashcode
    	System.out.println(a.hashCode());
    	System.out.println(b.hashCode());
    	
    	// list
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(a);
    	list.add(b);
    	
    	System.out.println(list);
    	
    	// hash set
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	System.out.println(set);
    }
    
    public String toString() {
    	return month + "-" + day + "-" + year + " is holiday: " + isHoliday;
    }

}
