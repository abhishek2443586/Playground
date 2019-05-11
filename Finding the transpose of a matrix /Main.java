import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int mat1[][] = new int[rowSize][colSize];
        
        int result[][] = new int[colSize][rowSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        for(int k=0;k<colSize;k++){
            for(int m=0;m<rowSize;m++){
                result[k][m] = mat1[m][k];
               
            }
        }
        for(int n=0;n<colSize;n++){
            for(int p=0;p<rowSize;p++){
                System.out.print(result[n][p] + " ");
               
            }
            System.out.println();
        }
  }
}