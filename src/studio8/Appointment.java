package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;

	public Appointment(Date d, Time t) {
		date = d;
		time = t;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		Date a = new Date(12, 31, 2020, true);
		Date b = new Date(5, 12, 2023, false);

		Time c = new Time(23, 57);
		Time d = new Time(18, 39);

		Appointment f = new Appointment(a, c);
		Appointment r = new Appointment(b, d);
		
		System.out.println(f);
		System.out.println(r);

	}
	
	public String toString() {
		return "Appointment " + date.toString() + " " + time.toString();
	}
}
