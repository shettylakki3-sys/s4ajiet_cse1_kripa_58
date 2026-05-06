import java.util.ArrayList;
import java.util.Collections;
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
	    Collections.sort(cse);
	    Collections.sort(cse,Collections.reverseOrder());
		System.out.println(cse);
		System.out.println(cse.get(0));
		System.out.println(cse.size());
	}
}
