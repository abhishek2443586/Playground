import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int firstDigit = n1 / 100;
      int secondDigit = (n1 % 100) / 10;
      int lastDigit = n1 % 10;
      int sum = firstDigit + secondDigit + lastDigit;
      System.out.println(firstDigit);
	}
}
