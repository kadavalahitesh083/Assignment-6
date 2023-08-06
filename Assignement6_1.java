public class Assignement6_1 
{
    public static void main(String[] args) 
    {
        int n = 5; 
        int[][] spiral = new int[n][n];
        int num = 1;
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (num <= n * n) 
        {
           
            for (int i = colStart; i <= colEnd; i++) 
            {
                spiral[rowStart][i] = num++;
            }
            rowStart++;

            
            for (int i = rowStart; i <= rowEnd; i++) 
            {
                spiral[i][colEnd] = num++;
            }
            colEnd--;

            
            for (int i = colEnd; i >= colStart; i--) 
            {
                spiral[rowEnd][i] = num++;
            }
            rowEnd--;

          
            for (int i = rowEnd; i >= rowStart; i--) 
            {
                spiral[i][colStart] = num++;
            }
            colStart++;
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
