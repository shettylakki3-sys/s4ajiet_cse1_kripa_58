import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String>cse=new ArrayList<String>();
	    cse.add("Java");
	    cse.add("Python");
	    cse.add("Java");
	    cse.add(0,"Kripa");
	    cse.set(1,"ADA");
	    cse.remove(2);
		System.out.println(cse);
		System.out.println(cse.get(0));
		System.out.println(cse.size());
		System.out.println("Before Clear:"+cse);
		cse.clear();
		System.out.println("After Clear:"+cse);
	}
}
