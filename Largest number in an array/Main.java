import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int largest = 0;
      int arr[] = new int[size];
      for(int i=0;i<size;i++){
        arr[i] = s.nextInt();
      }
      for(int j=0;j<size;j++){
        if(largest<arr[j]){
          largest = arr[j];
        }
      }
      System.out.println(largest);
    }
}