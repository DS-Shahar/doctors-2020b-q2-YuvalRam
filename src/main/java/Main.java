package yuval;
import java.util.*;
public class L17_3 {
	public static Scanner reader = new Scanner (System.in);


	public static void main(String[] args) {
		Doctor[] doctors = {new Doctor("Reut","Eyes"), new Doctor("Ofri", "Nose")};
		q_b(doctors);
		for (int i = 0; i < doctors.length; i++) {
			System.out.println(doctors[i]);
		}
		
		Athlete a = new Athlete("Ofri", 2);
		Athlete b = new Athlete("Reut", 4);

	}
	
	public static void q_b(Doctor[] doctors) {
		int c = 0;
		double sum = 0;
		double rate = 0;
		for (int i = 0; i < doctors.length; i++) {
			System.out.println("please enter rate");
			rate = reader.nextDouble();
			while(rate!=-1) {
				sum += rate;
				c++;
				System.out.println("please enter rate");
				rate = reader.nextDouble();
			}
			doctors[i].setRate(sum/c);
			c = 0;
			sum = 0;
		}
	}

}
