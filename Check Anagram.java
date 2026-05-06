import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    String s1="listen";
	    String s2="silent";
	    
	    if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        
	    char[] a=s1.toLowerCase().toCharArray();
	    char[] b=s2.toLowerCase().toCharArray();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    if(Arrays.equals(a,b)){
	        System.out.println("Anagram");
	    }else{
	        System.out.println("Not Anagram");
	    }
	}
}
