import java.util.*;
public class Main
{
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    static int lcm(int a, int b, int gcdvalue){
        return Math.abs(a*b)/gcdvalue;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		int gcdvalue = gcd(a, b);
		System.out.println(lcm(a, b, gcdvalue));
	}
}