import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		a = (a+b)-a;
		b = (a+b)-b;
		System.out.println("The values of a and b after swapping is a = "+a+" and b = "+b);
	}
}