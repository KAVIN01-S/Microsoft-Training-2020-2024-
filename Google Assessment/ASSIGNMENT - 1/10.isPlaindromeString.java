import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revrese = "";
     for(int i = str.length()-1 ; i >= 0 ; i--)
     {
         reverse += str.charAt(i);
     }
     if(reverse.equals(str))
     {
         System.out.println(str+" is a palindrome");
     }
     else
     {
         System.out.println(str+" is not a palindrome");
     }
   }
}