package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is24;
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, is24, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && is24 == other.is24 && minute == other.minute;
	}

	/**
	 * Creates a new time object
	 * @param h integer hours
	 * @param m minutes integer
	 */
	public Time(int h, int m) {
		hour = h;
		minute = m;
		is24 = true;
	}
	
	public static void main(String[] args) {
		Time a = new Time(24,24);
		Time b = new Time(0,0);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		// equals
    	System.out.println(a==b);
    	System.out.println(a.equals(b));
    	
    	// hashcode
    	System.out.println(a.hashCode());
    	System.out.println(b.hashCode());
    	
    	// list
    	LinkedList<Time> list = new LinkedList<Time>();
    	list.add(a);
    	list.add(b);
    	
    	System.out.println(list);
    	
    	// hash set
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(a);
    	set.add(b);
    	System.out.println(set);
    }
	
	public String toString() {
		return "Hour: " + hour + " Minute: " + minute + "is 24-hour: " + is24;
	}

}