import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s = new Scanner(System.in);
          int n = s.nextInt();
      int sum =0;
      while(n>0)
      {
        int lastDigit = n % 10;
        sum = sum + lastDigit;
        n = n/10;
      }
      System.out.println(sum);
      
	}
}