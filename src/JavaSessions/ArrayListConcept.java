package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//default class in Jdk
		//dynamic in nature
		//can store diff types of values (raw types)
		//can provide generics also (only one type of values)
		
		ArrayList ar = new ArrayList(); //10
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());

		ar.add(500);//4
		ar.add(600);//5
		
		ar.add(12.33);
		ar.add("Selenium");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException

//		ar.remove(4);
//		
//		System.out.println(ar.get(4));
//		System.out.println(ar.size());
		
		//to print all the values from arraylist:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//data types (Generics) based ArrayList:
		
		ArrayList<String> stundentList = new ArrayList<String>();
		stundentList.add("sheba");//0
		stundentList.add("Hari");//1
		stundentList.add("Hari");//2
		
		System.out.println(stundentList.get(2));
		System.out.println(stundentList.size());


		ArrayList<Integer> stundentMarks = new ArrayList<Integer>();
		stundentMarks.add(100);
		stundentMarks.add(200);
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add(12.33);
		empData.add(true);
		empData.add('m');

		
	}

}
