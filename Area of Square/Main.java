import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
      int side = s.nextInt();
      int area = side * side;
      System.out.println(area);
    }
}