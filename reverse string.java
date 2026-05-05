class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb=new StringBuilder(String.valueOf(s));
        sb.reverse().toString();
        for(int i=0;i<s.length;i++)
        {
            s[i]=sb.charAt(i);
        }
        
    }
}
