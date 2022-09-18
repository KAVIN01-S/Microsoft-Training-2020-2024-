import java.util.*;
public class Main
{
    public static boolean ps(int a){
        if(a > 0){
            int sq = (int)Math.sqrt(a);
            return ((sq * sq) == a);
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(ps(N)){
		    System.out.println(N+" is a perfect square");
		}
            else
            {
		    System.out.println(N+" is not a perfect square");
		}
	}
}