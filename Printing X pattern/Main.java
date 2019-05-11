import java.util.Scanner;
class Main {
	public static void main (String[] args){
Scanner s = new Scanner(System.in);
    int size = s.nextInt();
   for(int i=0; i < size ;i++)
    {
        //4
        for(int j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
               System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        //6
        System.out.print("\n");
    }

    }
}