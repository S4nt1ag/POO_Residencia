package exemploCarros;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCarros {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		/*for (String i : cars) {
			System.out.println(i);
		}
		System.out.println(cars.size());*/
		
		Collections.sort(cars);
	    for (String i : cars) {
	      System.out.println(i);
	    }

	}

}
