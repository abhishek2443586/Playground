import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int n = s.nextInt();
    while(n>=100){
      n=n/10;
    }
    int secondDigit = n % 10;
    System.out.println(secondDigit);
  }
}