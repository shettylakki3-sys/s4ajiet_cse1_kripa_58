import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String>cse=new HashMap<>();
	    cse.put(101,"ALice");
	    cse.put(102,"Bob");
	    cse.put(104,"Man");
	    cse.remove(102);
		System.out.println("to get the value:"+cse.get(102));
		System.out.println("size is:"+cse.size());
		System.out.println("Before Clear:"+cse);
		cse.clear();
		System.out.println("After Clear:"+cse);
	}
}
