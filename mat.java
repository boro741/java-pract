import java.io.*;

class mat
{
    public static void main(String args[])
    {
        int mat1[][] = {
            {1,2,3},
            {4,5,6},
            {9,8,7}
        },
            mat2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int  mat3[][];
        int i , j, k;
        
        for(i=0; i<=2; i++){
            for(j=0; j <= 2; j++){
                for(k=0; k <= 2; k++){
                    mat3[i][j] +=  mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        System.out.println("After Matrix Multiplication");
        
        for(i=0; i <= 2; i++){
                for(j=0; j <= 2; j++){
                   System.out.println(mat3[i][j] + "\t");
                }
            }
        
    }
}