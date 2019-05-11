import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int result = sum(num);
      System.out.println(result);
	}
  public static int sum(int n){
    int sum =0;
    for(int i =1;i<=n;i++){
      sum = sum + i;
    }
    return sum;
  }
}