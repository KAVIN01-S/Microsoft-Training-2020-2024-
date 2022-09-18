import java.util.*;
public class MyClass
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
            int C = scan.nextInt();
		int mat[][] = new int[R][C];
		for(int r = 0 ; r < R ; r++){
		    for(int c = 0 ; c < C ; c++){
		        mat[r][c] = sc.nextInt();
		    }
		}
            for(int r = 0 ; r < C ; r++){
		    for(int c = 0 ; c < R ; c++){
		        System.out.print(mat[r][c]+" ");
		    }
		    System.out.println();
		}
      }
}
      