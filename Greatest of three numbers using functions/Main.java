
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      greatest(n1,n2,n3);
	}
  public static void greatest(int a,int b,int c){
    int result=0;
    if(a<b){
      result = b;
    }
    else{
      result = a;
    }
    if(result<c){
      System.out.println(c);
    }
    else{
      System.out.println(result);
    }
  }
}