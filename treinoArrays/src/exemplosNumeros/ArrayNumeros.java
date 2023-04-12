package exemplosNumeros;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> myNumb = new ArrayList<Integer>();
		myNumb.add(33, 88);
		myNumb.add(15);
		myNumb.add(20);
		myNumb.add(34);
		myNumb.add(8);
		myNumb.add(12);
		for (int i : myNumb ) {
			System.out.println(i);
		}
		 //Collections.sort(myNumb);

		   // for (int i : myNumb) {
		   //   System.out.println(i);
		   // }

	}

}
