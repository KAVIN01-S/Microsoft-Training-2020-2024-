
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length() || s2.length()==0)
        {
            return false;
        }
        if(s1.length()==0)
        {
            return true;
        }
        int x=s1.length(),y=s2.length();
        int[] a = new int[26];
        int[] b = new int[26];
        
        for(int i=0;i<x;i++)
        {
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        
        for(int i=x;i<y;i++)
        {
            if(Arrays.equals(a,b))
            {
                return true;
            }
            b[s2.charAt(i-x)-'a']--;
            b[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
