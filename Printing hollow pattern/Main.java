import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int m = n;
	   for (int i = 1; i <= n; i++) 
        { 
            for (int j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
	}
}