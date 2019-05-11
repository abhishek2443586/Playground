import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    int largest = 0;
    int index = 0;
    for(int i=0;i<n;i++){
      list[i]=sc.nextInt();
    }
    
    for(int j=0;j<n;j++){
      if(list[j] > largest){
        largest = list[j];
        index = j;
      }
    }
    System.out.println(index);
  }
}