import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
            int[] ht = new int[26];
            for(int i = 0 ; i < str.length() ; i++)
            {
                 ht[str.charAt(i)-'a']++;
            }
            for(int i=0;i < 26; i++)
            {
                 if(ht[i]>0)
                 {
                     System.out.println((char)i+97+" : "+ht[i]);
                 }
            }
      }
} 
             