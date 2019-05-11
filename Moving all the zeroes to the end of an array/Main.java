import java.util.Scanner;
class Main{
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int list[] = new int[size];
      
      for(int i=0;i<size;i++){
        list[i] = sc.nextInt();
      }
      segrigate(size,list);
      
      for(int j=0;j<size;j++){
        System.out.print(list[j] + " ");
      }
    }
  public static void segrigate(int n,int arr[]){
    int count = 0;
    for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; 
        while (count < n) 
            arr[count++] = 0;
  }
}