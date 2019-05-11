import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
        StringBuilder reversedString = null;
        String str = sc.nextLine();
 StringBuilder sb = new StringBuilder(str);
 
        String[] splitedString = str.split(" ");
        
        for(int i=0;i<splitedString.length;i++){
            //System.out.println(splitedString[i]);
        StringBuilder splitedstring = new StringBuilder(splitedString[i]);
         reversedString = splitedstring.reverse();
         System.out.print(reversedString + " ");
        }
  }
}