public class Assignement6_4 
{
    public static void main(String[] args) 
    {
        int rows = 7; 
        for (int i = 0; i < rows; i++) 
        {
            
            for (int j = 0; j < i; j++) 
            {
                System.out.print(" ");
            }
            
           
            for (int j = 0; j < rows - i; j++) 
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        
        for (int i = 0; i < rows; i++) 
        {
            
            for (int j = 0; j < rows - i - 1; j++) 
            {
                System.out.print(" ");
            }
            
            
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
