//Swap and Negate the matrix
import java.util.Scanner;
class SwapAndNegate{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
                if(i%2==0)
                    mat[i][j] = -mat[i][j];
            }
        }
        for(int j=0;j<n;j++){
            int temp = mat[0][j];
            mat[0][j] = mat[n-1][j];
            mat[n-1][j] = temp;
        }
        System.out.println("The swapped and negated matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }        sc.close();
    }
}
