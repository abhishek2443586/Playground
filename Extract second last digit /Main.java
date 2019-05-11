import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
      int n1= s.nextInt();
      int secondDigit = (n1 % 100) / 10;
      System.out.println(secondDigit);
	}
}