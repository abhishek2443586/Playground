import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact=1;
    fact = factorial(num);
    System.out.println(fact);
  }
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    else{
      return (n*factorial(n-1));
    }
  }
}