import java.util.*;
public class test{
	public static void main(String args[]) {
		ArrayList<Integer>vector = new ArrayList<Integer>();
		vector.add(4);
		vector.add(7);
		vector.add(2);
		vector.add(21);
		vector.add(9);
		vector.trimToSize();
		Iterator<Integer>iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
