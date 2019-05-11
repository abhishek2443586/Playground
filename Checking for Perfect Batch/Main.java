import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    
    for(int i=0;i<n;i++){
      list[i]=sc.nextInt();
    }
     batch(n,list);
    
    
  }
    
    
    public static void batch(int size,int arr[]){
      int sum1 = 0,sum2 = 0,sum3 = 0;
      for(int j = 0;j<3;j++){
      sum1 = sum1 + arr[j];
    }
       
      for(int k=3 ;k<6;k++){
        sum2 = sum2 + arr[k];
      }
      /*for(int l=6;l<size-1;l++){
        sum3 = sum3 + arr[l];
      }*/
      if(sum1 == sum2){
        System.out.println("Perfect Batch");
      }
      else{
        System.out.println("Not a Perfect Batch");
      }
    }
}