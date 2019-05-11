import java.util.Scanner;
class Main{
    public static void main(String args[]) {
Scanner s = new Scanner(System.in);
    String str = s.nextLine();
      boolean isPalindrome =false ;
      int strLength = str.length();
      int front =0;
      int end = strLength - 1;
      while(front < end){
        if(str.charAt(front)==str.charAt(end)){
          isPalindrome = true;
          front++;
          end--;
        }
        break;
      }
      if(isPalindrome == true){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
    } 
}