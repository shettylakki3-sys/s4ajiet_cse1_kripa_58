import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer>cse=new LinkedList<Integer>();
	    cse.add(10);
	    cse.add(20);
	    cse.addFirst(5);
	    cse.addLast(7);
	    cse.removeFirst();
	    cse.removeLast();
	    cse.getFirst();
	    cse.getLast();
		System.out.println(cse);
		System.out.println(cse.get(0));
	}
}
