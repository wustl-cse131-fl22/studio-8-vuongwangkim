package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {
	public Set<Appointment> cal;
	
	public Calendar(Set<Appointment> d) {
		cal = d;
	}
	
	public String toString() {
		return cal.toString();
	}
	
	public static void main(String[] args) {
		Date a = new Date(12, 31, 2020, true);
		Date b = new Date(5, 12, 2023, false);

		Time c = new Time(23, 57);
		Time d = new Time(18, 39);

		Appointment f = new Appointment(a, c);
		Appointment r = new Appointment(b, d);
		
		Set<Appointment> g = new HashSet<Appointment>();
		g.add(f);
		g.add(r);
		
		System.out.println(g.toString());
		
	}
}
