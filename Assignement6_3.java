public class Assignement6_3 
{
    public static void main(String[] args) 
    {
        int rows = 6; 
        
        for (int i = 0; i < rows; i++) 
        {
            
            for (int j = 0; j < rows - i - 1; j++) 
            {
                System.out.print("  ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) 
            {
               
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
                if (j < i) 
                {
                    System.out.print("   ");
                }
            }
            
            System.out.println();
        }
    }
}
