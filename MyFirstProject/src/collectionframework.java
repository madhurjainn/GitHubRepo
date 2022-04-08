import java.util.ArrayList;
import java.util.LinkedList;

public class collectionframework {

	public static void main(String[] args) {
//Java Collections are present in java.util package
//ArrayList   Better Storing and Accessing of Elements.; Act as a List only
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		ArrayList<Integer> age=new ArrayList<>(l2);
		age.add(1);
		l1.add(5);
		l1.add(4);
		l1.add(7);
		l1.add(8);
		l2.add(14);
		l2.add(18);
		l2.add(24);
		l2.add(36);
		System.out.print(("Does L1 contains 14? Answer: "));
		System.out.println(l1.contains(14));
		System.out.print(("Does L2 contains 14? Answer: "));
		System.out.println(l2.contains(14));
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+ " ");
		}
		for(int i:l1) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l2.get(i) + " ");
		}
		System.out.println();
		l1.addAll(l2);// joining two lists.
		//for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1 + " ");
		//}
		System.out.println();
		l1.addAll(0, l2);// joining l2 to l1 at specified index(index 0).
		//for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1+ " ");
	//	}
			System.out.println(age);

//linkedList   Better Manipulation Act as List and Queue
		LinkedList<Integer> l3 = new LinkedList<>();
		l3.add(100);
		l3.add(101);
		l3.add(102);
		l3.add(103);
		l3.addFirst(99);//method not present in ArrayList
		l3.addLast(104);//method not present in ArrayList
		System.out.println();
		try {
		//for (int i = 0; i < l1.size(); i++) {
			System.out.print(l3 + " ");
		}catch(IndexOutOfBoundsException e) {}
		}
	

}


	

