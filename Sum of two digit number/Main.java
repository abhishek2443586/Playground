import java.util.*;
class Main {
	public static void main (String[] args) {
Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int firstDigit = n1 / 10;
      int lastDigit = n1 % 10;
      int sum = firstDigit + lastDigit;
      System.out.println(sum);
    }
}