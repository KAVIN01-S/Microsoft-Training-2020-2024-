import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		System.out.println("Enter the elements in the array:");
		for(int i = 0 ; i < N ; i++){
		    arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The second Maximum element is "+arr[N-2]);
	}
}