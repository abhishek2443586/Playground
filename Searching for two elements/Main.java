import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);
      int foundele1 = 0,foundele2 =0;
      Boolean flagele1 = false;
      Boolean flagele2 = false;
      int ele1 = 0,ele2 = 0;
      int size = s.nextInt();
      int arr[] = new int[size];
      for(int i = 0;i<size;i++){
        arr[i] = s.nextInt();
      }
      int searchele1 = s.nextInt();
      int searchele2 = s.nextInt();
      for(int j= 0;j<size;j++){
        if(searchele1 == arr[j]){
          
         flagele1 = true;
          foundele1 = j;
          break;
               
        }
        
      }
      for(int k= 0;k<size;k++){
        if(searchele2 == arr[k]){
          flagele2 = true;
          foundele2 = k;
          break;
          }
        }
      if(flagele1){
        System.out.println(foundele1);
      }
      else{
        System.out.println("-1");
      }
      if(flagele2){
        System.out.println(foundele2);
      }
      else{
        System.out.println("-1");
      }
      
    }
}