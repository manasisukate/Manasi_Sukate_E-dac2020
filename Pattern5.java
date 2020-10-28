/*
Output:  
                9
              8 9 8 
            7 8 9 8 7 
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5 
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
*/

package assignment2;

public class Pattern5 {
    public static void main(String args[])
    {
        int row=9;
        for(int i=row;i>=1;i--)
        {
            //pattern1
        
            //pattern2
            for(int j=9;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
