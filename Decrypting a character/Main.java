import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      if(ch>='a' && ch<='z'){
        int offset = ch - 'z';
        offset = (offset - key)%26;
        ch = (char)(offset + 'z');
        System.out.println(ch);
      }else if(ch>='A' && ch<='Z'){
         int offset = ch -'Z';
        offset = (offset - key)%26;
        ch = (char)(offset + 'Z');
        System.out.println(ch);
      }
      
    }
}