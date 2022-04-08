import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.addElement(10);v.addElement("Ram");v.addElement(24);v.addElement("Sita");
		v.add(1);v.add(2);v.add(3);v.add(4);
		System.out.println(v);
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(20);v1.add(30);v1.add(40);v1.add(50);
		System.out.println(v1);
		}
	}

