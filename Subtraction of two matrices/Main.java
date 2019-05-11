import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int mat1[][] = new int[rowSize][colSize];
        int mat2[][] = new int[rowSize][colSize];
        int result[][] = new int[rowSize][colSize];
        
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        
        for(int m=0;m<rowSize;m++){
            for(int n=0;n<colSize;n++){
                mat2[m][n] = sc.nextInt();
            }
        }
       
 for(int k=0;k<rowSize;k++){
            for(int l=0;l<colSize;l++){
                result[k][l] = mat1[k][l] - mat2[k][l];
                System.out.print(result[k][l] + " ");
            }
            System.out.println();
        }
  }
}