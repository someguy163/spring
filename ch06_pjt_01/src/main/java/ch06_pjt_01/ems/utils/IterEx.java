package ch06_pjt_01.ems.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("ArrayList");

		ArrayList<String> cars = new ArrayList<>();
		cars.add("a");
		cars.add("b");
		cars.add("c");
		cars.add("d");


		Iterator<String> iterator = cars.iterator();
		System.out.println("ArrayList while문");
		System.out.println("--------------");
		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
		System.out.println("ArrayList for문");
		System.out.println("--------------");

		for(String string : cars) {
			System.out.println(string);
		}

		System.out.println("Set");
		System.out.println();
		Set<String> cars2 = new HashSet<>();

		cars2.add("A");
		cars2.add("B");
		cars2.add("C");
		cars2.add("D");

		Iterator<String> iterator2 = cars2.iterator();
		System.out.println("Set while문");
		System.out.println("--------------");
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
		System.out.println("Set for문");
		System.out.println("--------------");
		for(String str2 : cars2) {
			System.out.println(str2);
		}

		//컬렉션 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("while문을 지나기 전 리스트에 들어있던 값 : " + list);

		//리스트에 들어있는 값에 각각 '+' 붙이기
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "+");
		}
		System.out.println("while문 지난 후 수정된 결과 : "  + list);

		//리스트에 들어오는 값을 역순으로 표시
		System.out.println("역순 출력 결과 : "); 
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.println(element + " ");
		}
		System.out.println();

	}

}
