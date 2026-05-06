import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
	    HashSet<Integer>cse=new HashSet<>();
	    cse.add(2);
	    cse.add(20);
	    cse.add(2);
	    cse.add(7);
	    cse.remove(7);
	    cse.contains("kripa");
	  
		System.out.println(cse);
		System.out.println("kripa is consist or not:"+cse.contains("kripa"));
		System.out.println("Before clear:"+cse);
		cse.clear();
		System.out.println("After clear:"+cse);
		System.out.println(cse.size());
	
	}
}
