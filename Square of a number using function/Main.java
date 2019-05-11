import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      products(num);
	} 
  public static void products(int n){
    int product = n * n;
    System.out.println(product);
    
  }
}