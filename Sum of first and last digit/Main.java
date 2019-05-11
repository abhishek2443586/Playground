import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int lastDigit = num % 10;
      while(num>=10)
      {
        num=num/10;
      }
      int sum = lastDigit + num;
      System.out.println(sum);
	}
}