import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int firstDigit = n1 / 100;
      int lastDigit = n1 % 10;
      int num = firstDigit + lastDigit;
      System.out.println(num);
	}
}