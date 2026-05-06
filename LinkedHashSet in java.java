import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
	    LinkedHashSet<Integer>cse=new LinkedHashSet<>();
	    cse.add(2);
	    cse.add(20);
	    cse.add(2);
	    cse.add(7);
	    cse.remove(7);
		System.out.println("2 is present or not:"+cse.contains("kripa"));
		System.out.println("size is:"+cse.size());
		System.out.println("Before Clear:"+cse);
		cse.clear();
		System.out.println("After Clear:"+cse);
	}
}
