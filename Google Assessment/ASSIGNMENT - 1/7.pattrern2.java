import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = n ; i >= 1 ; i--){
		    for(int j = i ; j >= 1 ; j--){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}