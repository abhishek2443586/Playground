import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int firstDigit = num / 100;
    int secondDigit = (num % 100) / 10;
    int lastDigit = num % 10;
    int revNum = (lastDigit * 100) + (secondDigit * 10) + firstDigit;
    System.out.println(revNum);
  }
}